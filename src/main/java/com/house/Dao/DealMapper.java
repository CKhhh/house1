package com.house.Dao;

import com.house.Bean.Deal;
import com.house.Bean.DealExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealMapper {
    long countByExample(DealExample example);

    int deleteByExample(DealExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Deal record);

    int insertSelective(Deal record);

    List<Deal> selectByExample(DealExample example);

    Deal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Deal record, @Param("example") DealExample example);

    int updateByExample(@Param("record") Deal record, @Param("example") DealExample example);

    int updateByPrimaryKeySelective(Deal record);

    int updateByPrimaryKey(Deal record);
    List<Deal> selectAll(String status);
    List<Deal> selectBlurry(String blurry);
    void truncate();
}