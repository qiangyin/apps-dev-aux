package com.cloudzone.service.impl;

import com.cloudzone.common.entity.Doc;
import com.cloudzone.common.entity.DocExample;
import com.cloudzone.mapper.DocMapper;
import com.cloudzone.service.DocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yintongjiang
 * @params
 * @since 2018/4/18
 */
@Service
public class DocServiceImpl implements DocService {
    @Autowired
    private DocMapper docMapper;

    @Override
    public long countByExample(DocExample example) {
        return docMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DocExample example) {
        return docMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return docMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Doc record) {
        return docMapper.insert(record);
    }

    @Override
    public int insertSelective(Doc record) {
        return docMapper.insertSelective(record);
    }

    @Override
    public List<Doc> selectByExample(DocExample example) {
        return docMapper.selectByExample(example);
    }

    @Override
    public Doc selectByPrimaryKey(Integer id) {
        return docMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Doc record, DocExample example) {
        return docMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Doc record, DocExample example) {
        return docMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Doc record) {
        return docMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Doc record) {
        return docMapper.updateByPrimaryKey(record);
    }
}
