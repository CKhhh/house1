package com.house.Service.deal;

import com.house.Bean.Deal;
import com.house.Dao.DealMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-02-11 16:13
 */
@Service
public class DealImpl implements DealService {
    @Autowired
    DealMapper dealMapper;
    @Override
    public void insertDeal(Deal deal) {
        dealMapper.insertSelective(deal);
    }

    @Override
    public void updateDeal(Deal deal) {
        dealMapper.updateByPrimaryKeySelective(deal);
    }

    @Override
    public List<Deal> selectAll(String status) {
        return dealMapper.selectAll(status);
    }

    @Override
    public List<Deal> selectBlurry(String blurry) {
        return dealMapper.selectBlurry(blurry);
    }

    @Override
    public void truncate() {
        dealMapper.truncate();
    }
}
