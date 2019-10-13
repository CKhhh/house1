package com.house.Service.deal;

import com.house.Bean.Deal;

import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-02-11 16:13
 */
public interface  DealService {
    void insertDeal(Deal deal);
    void updateDeal(Deal deal);
    List<Deal> selectAll(String status);
    List<Deal> selectBlurry(String blurry);
    void truncate();
}
