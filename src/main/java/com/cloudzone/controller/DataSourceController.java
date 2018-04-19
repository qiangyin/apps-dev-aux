package com.cloudzone.controller;

import com.cloudzone.common.entity.DataSource;
import com.cloudzone.common.entity.DataSourceExample;
import com.cloudzone.common.entity.ResponseResult;
import com.cloudzone.service.DataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yintongjiang
 * @params
 * @since 2018/4/18
 */
@RestController
@RequestMapping("/data_source")
public class DataSourceController {
    @Autowired
    private DataSourceService dataSourceService;

    /**
     * 添加数据库
     *
     * @param dataSourceVO
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.POST,
            consumes = "application/json;charset=UTF-8",
            produces = "application/json;charset=UTF-8")
    public ResponseResult<DataSource> addDataSource(@RequestBody DataSource dataSourceVO) {
        dataSourceService.insert(dataSourceVO);
        return new ResponseResult<>(dataSourceVO);
    }

    /**
     * 根据类型查询数据列表
     *
     * @param title
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET,
            consumes = "application/json;charset=UTF-8",
            produces = "application/json;charset=UTF-8")
    public ResponseResult<List<DataSource>> selectDataSources(@RequestParam(value = "title", required = false) String title) {
        DataSourceExample DataSourceExample = new DataSourceExample();
        DataSourceExample.createCriteria().andTypeEqualTo(title);
        return new ResponseResult<List<DataSource>>(dataSourceService.selectByExample(DataSourceExample));
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
    public ResponseResult<DataSource> selectById(@RequestParam(value = "id", required = false) Integer id) {
        return new ResponseResult(dataSourceService.selectByPrimaryKey(id));
    }
}
