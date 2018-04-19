package com.cloudzone.service.impl;

import com.cloudzone.common.entity.Extension;
import com.cloudzone.common.entity.ExtensionExample;
import com.cloudzone.mapper.ExtensionMapper;
import com.cloudzone.mapper.MsgMapper;
import com.cloudzone.service.ExtensionService;
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
public class ExtensionServiceImpl implements ExtensionService {
    @Autowired
    private ExtensionMapper eMapper;

    @Override
    public long countByExample(ExtensionExample example) {
        return eMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ExtensionExample example) {
        return eMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return eMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Extension record) {
        return eMapper.insert(record);
    }

    @Override
    public int insertSelective(Extension record) {
        return eMapper.insertSelective(record);
    }

    @Override
    public List<Extension> selectByExample(ExtensionExample example) {
        return eMapper.selectByExample(example);
    }

    @Override
    public Extension selectByPrimaryKey(Integer id) {
        return eMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Extension record, ExtensionExample example) {
        return eMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Extension record, ExtensionExample example) {
        return eMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Extension record) {
        return eMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Extension record) {
        return eMapper.updateByPrimaryKey(record);
    }
}
