package com.cloudzone.mapper;

import com.cloudzone.common.entity.Lang;
import com.cloudzone.common.entity.LangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LangMapper {
    long countByExample(LangExample example);

    int deleteByExample(LangExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Lang record);

    int insertSelective(Lang record);

    List<Lang> selectByExample(LangExample example);

    Lang selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Lang record, @Param("example") LangExample example);

    int updateByExample(@Param("record") Lang record, @Param("example") LangExample example);

    int updateByPrimaryKeySelective(Lang record);

    int updateByPrimaryKey(Lang record);
}