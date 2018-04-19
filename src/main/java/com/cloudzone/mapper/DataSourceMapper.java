package com.cloudzone.mapper;

import com.cloudzone.common.entity.DataSource;
import com.cloudzone.common.entity.DataSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataSourceMapper {
    long countByExample(DataSourceExample example);

    int deleteByExample(DataSourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataSource record);

    int insertSelective(DataSource record);

    List<DataSource> selectByExample(DataSourceExample example);

    DataSource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataSource record, @Param("example") DataSourceExample example);

    int updateByExample(@Param("record") DataSource record, @Param("example") DataSourceExample example);

    int updateByPrimaryKeySelective(DataSource record);

    int updateByPrimaryKey(DataSource record);
}