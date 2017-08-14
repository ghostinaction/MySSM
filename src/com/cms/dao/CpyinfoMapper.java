package com.cms.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.cms.entity.Cpyinfo;
import com.cms.entity.CpyinfoExample;

public interface CpyinfoMapper {
    int countByExample(CpyinfoExample example);

    int deleteByExample(CpyinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cpyinfo record);

    int insertSelective(Cpyinfo record);

    List<Cpyinfo> selectByExample(CpyinfoExample example);

    Cpyinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cpyinfo record, @Param("example") CpyinfoExample example);

    int updateByExample(@Param("record") Cpyinfo record, @Param("example") CpyinfoExample example);

    int updateByPrimaryKeySelective(Cpyinfo record);

    int updateByPrimaryKey(Cpyinfo record);
}