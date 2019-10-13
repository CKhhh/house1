package com.house.Service.Finance;

import com.house.Bean.Finance;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-01-26 21:14
 */
public interface FinanceService {
    List<Finance> selectFinance(Date startTime, Date endTime, String branch, String area);
    void insertFinance(Finance finance);
    int selectAllPn();
    List<Finance> selectAllByStatus(String financeType, String listingId, String startTime, String endTime);
    List<BigDecimal> selectInByListingId(String id, String status,String startTime,String endTime);
    List<BigDecimal> selectInByOther(String branch,String department,String stauts,String startTime,String endTime);
}
