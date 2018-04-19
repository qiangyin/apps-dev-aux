package com.cloudzone.service.impl;

import com.cloudzone.common.entity.DataSource;
import com.cloudzone.common.entity.DataSourceExample;
import com.cloudzone.mapper.DataSourceMapper;
import com.cloudzone.service.DataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yintongjiang
 * @params
 * @since 2018/4/18
 */
@Service
public class DataSourceServiceImpl implements DataSourceService {
    @Autowired
    private DataSourceMapper dataSourceMapper;

    @Override
    public long countByExample(DataSourceExample example) {
        return dataSourceMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DataSourceExample example) {
        return dataSourceMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dataSourceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DataSource record) {
        return dataSourceMapper.insert(record);
    }

    @Override
    public int insertSelective(DataSource record) {
        return dataSourceMapper.insertSelective(record);
    }

    @Override
    public List<DataSource> selectByExample(DataSourceExample example) {
        return dataSourceMapper.selectByExample(example);
    }

    @Override
    public DataSource selectByPrimaryKey(Integer id) {
        return dataSourceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(DataSource record, DataSourceExample example) {
        return dataSourceMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(DataSource record, DataSourceExample example) {
        return dataSourceMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(DataSource record) {
        return dataSourceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DataSource record) {
        return dataSourceMapper.updateByPrimaryKey(record);
    }
}
