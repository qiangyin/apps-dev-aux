package com.cloudzone.controller;

import com.cloudzone.common.entity.Lang;
import com.cloudzone.common.entity.LangExample;
import com.cloudzone.common.entity.Msg;
import com.cloudzone.common.entity.ResponseResult;
import com.cloudzone.service.LangService;
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
@RequestMapping("/lang")
public class LangController {
    @Autowired
    private LangService langService;


    /**
     * 查询开发语言列表
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET,
            consumes = "application/json;charset=UTF-8",
            produces = "application/json;charset=UTF-8")
    public ResponseResult<List<Lang>> selectLangs() {
        LangExample langExample = new LangExample();
        return new ResponseResult<List<Lang>>(langService.selectByExample(langExample));
    }

}
