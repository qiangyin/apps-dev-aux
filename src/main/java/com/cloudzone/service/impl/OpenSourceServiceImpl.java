package com.cloudzone.service.impl;

import com.cloudzone.common.entity.OpenSource;
import com.cloudzone.common.entity.OpenSourceExample;
import com.cloudzone.mapper.OpenSourceMapper;
import com.cloudzone.service.OpenSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yintongjiang
 * @params
 * @since 2018/4/18
 */
@Service
public class OpenSourceServiceImpl implements OpenSourceService {
    @Autowired
    private OpenSourceMapper openSourceMapper;

    @Override
    public long countByExample(OpenSourceExample example) {
        return openSourceMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(OpenSourceExample example) {
        return openSourceMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return openSourceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OpenSource record) {
        return openSourceMapper.insert(record);
    }

    @Override
    public int insertSelective(OpenSource record) {
        return openSourceMapper.insertSelective(record);
    }

    @Override
    public List<OpenSource> selectByExample(OpenSourceExample example) {
        return openSourceMapper.selectByExample(example);
    }

    @Override
    public OpenSource selectByPrimaryKey(Integer id) {
        return openSourceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(OpenSource record, OpenSourceExample example) {
        return openSourceMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(OpenSource record, OpenSourceExample example) {
        return openSourceMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(OpenSource record) {
        return openSourceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OpenSource record) {
        return openSourceMapper.updateByPrimaryKey(record);
    }
}
