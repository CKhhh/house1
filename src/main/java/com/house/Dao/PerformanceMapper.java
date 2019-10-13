package com.house.Dao;

import com.house.Bean.Performance;
import com.house.Bean.PerformanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerformanceMapper {
    long countByExample(PerformanceExample example);

    int deleteByExample(PerformanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Performance record);

    int insertSelective(Performance record);

    List<Performance> selectByExample(PerformanceExample example);

    Performance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Performance record, @Param("example") PerformanceExample example);

    int updateByExample(@Param("record") Performance record, @Param("example") PerformanceExample example);

    int updateByPrimaryKeySelective(Performance record);

    int updateByPrimaryKey(Performance record);
    List<Performance> selectAllByListingId(String listingId);

}