package com.cloudzone.mapper;

import com.cloudzone.common.entity.OpenSource;
import com.cloudzone.common.entity.OpenSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpenSourceMapper {
    long countByExample(OpenSourceExample example);

    int deleteByExample(OpenSourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OpenSource record);

    int insertSelective(OpenSource record);

    List<OpenSource> selectByExample(OpenSourceExample example);

    OpenSource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OpenSource record, @Param("example") OpenSourceExample example);

    int updateByExample(@Param("record") OpenSource record, @Param("example") OpenSourceExample example);

    int updateByPrimaryKeySelective(OpenSource record);

    int updateByPrimaryKey(OpenSource record);
}