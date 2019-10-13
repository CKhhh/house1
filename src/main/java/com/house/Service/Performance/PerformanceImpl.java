package com.house.Service.Performance;

import com.house.Bean.Performance;
import com.house.Dao.PerformanceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-02-15 6:01
 */
@Service
public class PerformanceImpl implements PerformanceService {
    @Autowired
    PerformanceMapper performanceMapper;
    @Override
    public void insertPerformance(Performance performance) {
        performanceMapper.insertSelective(performance);
    }

    @Override
    public List<Performance> selectAllByListingId(String listingId) {
        return performanceMapper.selectAllByListingId(listingId);
    }
}
