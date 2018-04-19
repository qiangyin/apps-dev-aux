package com.cloudzone.mapper;

import com.cloudzone.common.entity.Extension;
import com.cloudzone.common.entity.ExtensionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExtensionMapper {
    long countByExample(ExtensionExample example);

    int deleteByExample(ExtensionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Extension record);

    int insertSelective(Extension record);

    List<Extension> selectByExample(ExtensionExample example);

    Extension selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Extension record, @Param("example") ExtensionExample example);

    int updateByExample(@Param("record") Extension record, @Param("example") ExtensionExample example);

    int updateByPrimaryKeySelective(Extension record);

    int updateByPrimaryKey(Extension record);
}