package com.cloudzone.service.impl;

import com.cloudzone.common.entity.Lang;
import com.cloudzone.common.entity.LangExample;
import com.cloudzone.mapper.LangMapper;
import com.cloudzone.service.LangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yintongjiang
 * @params
 * @since 2018/4/18
 */
@Service
public class LangServiceImpl implements LangService {
    @Autowired
    private LangMapper langMapper;

    @Override
    public long countByExample(LangExample example) {
        return langMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(LangExample example) {
        return langMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return langMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Lang record) {
        return langMapper.insert(record);
    }

    @Override
    public int insertSelective(Lang record) {
        return langMapper.insertSelective(record);
    }

    @Override
    public List<Lang> selectByExample(LangExample example) {
        return langMapper.selectByExample(example);
    }

    @Override
    public Lang selectByPrimaryKey(Integer id) {
        return langMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Lang record, LangExample example) {
        return langMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Lang record, LangExample example) {
        return langMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Lang record) {
        return langMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Lang record) {
        return langMapper.updateByPrimaryKey(record);
    }
}
