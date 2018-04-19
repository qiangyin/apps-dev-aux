package com.cloudzone.controller;

import com.cloudzone.common.entity.Extension;
import com.cloudzone.common.entity.ExtensionExample;
import com.cloudzone.common.entity.ResponseResult;
import com.cloudzone.service.ExtensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yintongjiang
 * @params
 * @since 2018/4/18
 */
@RestController
@RequestMapping("/extension")
public class ExtensionController {
    @Autowired
    private ExtensionService extensionService;


    /**
     * 查询扩展包列表
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET,
            consumes = "application/json;charset=UTF-8",
            produces = "application/json;charset=UTF-8")
    public ResponseResult<List<Extension>> selectETS() {
        ExtensionExample extensionExample = new ExtensionExample();
        return new ResponseResult<List<Extension>>(extensionService.selectByExample(extensionExample));
    }

}
