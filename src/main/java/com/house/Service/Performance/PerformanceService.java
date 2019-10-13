package com.house.Service.Performance;

import com.house.Bean.Performance;

import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-02-15 6:00
 */
public interface PerformanceService {
    void insertPerformance(Performance performance);
    List<Performance> selectAllByListingId(String listingId);
}
