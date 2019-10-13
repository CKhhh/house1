package com.house.Dao;

import com.house.Bean.Finance;
import com.house.Bean.FinanceExample;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceMapper {
    long countByExample(FinanceExample example);

    int deleteByExample(FinanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Finance record);

    int insertSelective(Finance record);

    List<Finance> selectByExample(FinanceExample example);

    Finance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Finance record, @Param("example") FinanceExample example);

    int updateByExample(@Param("record") Finance record, @Param("example") FinanceExample example);

    int updateByPrimaryKeySelective(Finance record);

    int updateByPrimaryKey(Finance record);

    List<Finance> selectByTime(@Param("branch") String branch,
                               @Param("area") String area,
                               @Param("startTime") Date startTime, @Param("endTime") Date endTime);
    int selectAllPn();
    List<Finance> selectAllByStatus(@Param("financeType") String financeType,
                                    @Param("listingId") String listingId,
                                    @Param("startTime") String startTime,
                                    @Param("endTime") String endTime);
    List<BigDecimal>selectInByListingId(@Param(value = "listingId")String listingId, @Param(value = "status" )String status,
                                        @Param("startTime") String startTime,
                                        @Param("endTime") String endTime);
    List<BigDecimal> selectInByListingOther(@Param(value = "financeType")String financeType,
                                        @Param(value = "area")String area,
                                        @Param(value = "status")String status,
                                            @Param("startTime") String startTime,
                                            @Param("endTime") String endTime);
}