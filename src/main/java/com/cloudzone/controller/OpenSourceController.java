package com.cloudzone.controller;

import com.cloudzone.common.entity.OpenSource;
import com.cloudzone.common.entity.OpenSourceExample;
import com.cloudzone.common.entity.ResponseResult;
import com.cloudzone.service.OpenSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yintongjiang
 * @params
 * @since 2018/4/18
 */
@RestController
@RequestMapping("/open_source")
public class OpenSourceController {
    @Autowired
    private OpenSourceService openSourceService;

    /**
     * 添加开源框架
     *
     * @param openSourceVO
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.POST,
            consumes = "application/json;charset=UTF-8",
            produces = "application/json;charset=UTF-8")
    public ResponseResult<OpenSource> addOpenSource(@RequestBody OpenSource openSourceVO) {
        openSourceService.insert(openSourceVO);
        return new ResponseResult<>(openSourceVO);
    }

    /**
     * 根据标题查询开源框架信息
     *
     * @param title
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET,
            consumes = "application/json;charset=UTF-8",
            produces = "application/json;charset=UTF-8")
    public ResponseResult<List<OpenSource>> selectOpenSources(@RequestParam(value = "title", required = false) String title) {
        OpenSourceExample openSourceExample = new OpenSourceExample();
        openSourceExample.createCriteria().andTitleLike(title);
        return new ResponseResult<List<OpenSource>>(openSourceService.selectByExample(openSourceExample));
    }

    /**
     * 根据id查询详细信息
     *
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET,
            consumes = "application/json;charset=UTF-8",
            produces = "application/json;charset=UTF-8")
    public ResponseResult<OpenSource> selectById(@RequestParam(value = "id", required = false) Integer id) {
        return new ResponseResult(openSourceService.selectByPrimaryKey(id));
    }
}
