package com.house.Service.Finance;

import com.house.Bean.Finance;
import com.house.Dao.FinanceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-01-26 21:14
 */
@Service
public class FinanceImpl implements FinanceService {
    @Autowired
    FinanceMapper financeMapper;
    @Override
    public List<Finance> selectFinance(Date startTime,Date endTime,String branch,String area) {
        return financeMapper.selectByTime(branch,area,startTime,endTime);
    }

    @Override
    public void insertFinance(Finance finance) {
        financeMapper.insertSelective(finance);
    }

    @Override
    public int selectAllPn() {
        return financeMapper.selectAllPn()/20+1;
    }

    @Override
    public List<Finance> selectAllByStatus(String financeType,String listingId,String startTime,String endTime) {
        return financeMapper.selectAllByStatus(financeType,listingId,startTime,endTime);
    }

    @Override
    public List<BigDecimal> selectInByListingId(String id, String status,String startTime,String endTime) {
        return financeMapper.selectInByListingId(id,status,startTime,endTime);
    }

    @Override
    public List<BigDecimal> selectInByOther(String branch, String department, String stauts,String startTime,String endTime) {
        return financeMapper.selectInByListingOther(branch,department,stauts,startTime,endTime);
    }

}
