package com.cloudzone.controller;

import com.cloudzone.common.entity.Doc;
import com.cloudzone.common.entity.DocExample;
import com.cloudzone.common.entity.ResponseResult;
import com.cloudzone.service.DocService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author yintongjiang
 * @params
 * @since 2018/4/18
 */
@RestController
@RequestMapping("/doc")
public class DocController {
    @Autowired
    private DocService docService;

    /**
     * 上传文件信息
     *
     * @param docVO
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.POST,
            consumes = "application/json;charset=UTF-8",
            produces = "application/json;charset=UTF-8")
    public ResponseResult<Doc> addDoc(Doc docVO, HttpServletRequest request, MultipartFile file) {
        String path = request.getServletContext().getContextPath();
        String filename = file.getOriginalFilename();
        docVO.setTitle(filename);
        File filepath = new File(path, filename);
        if (!filepath.getParentFile().exists()) {
            filepath.getParentFile().mkdirs();
        }
        try {
            file.transferTo(new File(path + File.separator + filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        docService.insert(docVO);
        return new ResponseResult<Doc>(docVO);
    }

    /**
     * 文档列表
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET,
            consumes = "application/json;charset=UTF-8",
            produces = "application/json;charset=UTF-8")
    public ResponseResult<List<Doc>> selecDocs() {
        DocExample docExample = new DocExample();
        docService.selectByExample(docExample);
        return new ResponseResult<List<Doc>>(docService.selectByExample(docExample));
    }

    /**
     * 根据文档id删除文档
     *
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.DELETE,
            consumes = "application/json;charset=UTF-8",
            produces = "application/json;charset=UTF-8")
    public ResponseResult delMsg(@RequestParam(value = "msgId", required = false) Integer id) {
        docService.deleteByPrimaryKey(id);
        return new ResponseResult();
    }

    /**
     * 文件下载
     *
     * @param request
     * @param filename
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/download")
    public ResponseEntity<byte[]> download(HttpServletRequest request,
                                           @RequestParam("filename") String filename,
                                           Model model) throws Exception {
        String path = request.getServletContext().getContextPath();
        File file = new File(path + File.separator + filename);
        HttpHeaders headers = new HttpHeaders();
        String downloadFielName = new String(filename.getBytes("UTF-8"), "iso-8859-1");
        headers.setContentDispositionFormData("attachment", downloadFielName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                headers, HttpStatus.CREATED);
    }
}
