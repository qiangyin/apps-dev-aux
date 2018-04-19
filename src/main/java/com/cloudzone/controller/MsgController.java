package com.cloudzone.controller;

import com.cloudzone.common.entity.Msg;
import com.cloudzone.common.entity.MsgExample;
import com.cloudzone.common.entity.ResponseResult;
import com.cloudzone.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yintongjiang
 * @params
 * @since 2018/4/18
 */
@RestController
@RequestMapping("/msg")
public class MsgController {
    @Autowired
    private MsgService msgService;

    /**
     * 新建消息
     *
     * @param msgVO
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.POST,
            consumes = "application/json;charset=UTF-8",
            produces = "application/json;charset=UTF-8")
    public ResponseResult<Msg> addMsg(@RequestBody Msg msgVO) {
        msgService.insert(msgVO);
        return new ResponseResult<Msg>(msgVO);
    }

    /**
     * 查询消息列表
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET,
            consumes = "application/json;charset=UTF-8",
            produces = "application/json;charset=UTF-8")
    public ResponseResult<List<Msg>> selecMsgs() {
        MsgExample msgExample = new MsgExample();
        msgService.selectByExample(msgExample);
        return new ResponseResult<List<Msg>>(msgService.selectByExample(msgExample));
    }

    /**
     * 根据消息id删除消息
     *
     * @param msgId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.DELETE,
            consumes = "application/json;charset=UTF-8",
            produces = "application/json;charset=UTF-8")
    public ResponseResult delMsg(@RequestParam(value = "msgId", required = false) Integer msgId) {
        msgService.deleteByPrimaryKey(msgId);
        return new ResponseResult();
    }
}
