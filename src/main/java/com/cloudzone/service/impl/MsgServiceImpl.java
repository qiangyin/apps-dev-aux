package com.cloudzone.service.impl;

import com.cloudzone.common.entity.Msg;
import com.cloudzone.common.entity.MsgExample;
import com.cloudzone.mapper.MsgMapper;
import com.cloudzone.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yintongjiang
 * @params
 * @since 2018/4/18
 */
@Service
public class MsgServiceImpl implements MsgService {
    @Autowired
    private MsgMapper msgMapper;

    @Override
    public long countByExample(MsgExample example) {
        return msgMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MsgExample example) {
        return msgMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return msgMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Msg record) {
        return msgMapper.insert(record);
    }

    @Override
    public int insertSelective(Msg record) {
        return msgMapper.insertSelective(record);
    }

    @Override
    public List<Msg> selectByExample(MsgExample example) {
        return msgMapper.selectByExample(example);
    }

    @Override
    public Msg selectByPrimaryKey(Integer id) {
        return msgMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Msg record, MsgExample example) {
        return msgMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Msg record, MsgExample example) {
        return msgMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Msg record) {
        return msgMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Msg record) {
        return msgMapper.updateByPrimaryKey(record);
    }
}
