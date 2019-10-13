package com.house.Service.OnlineComm;

import com.house.Bean.OnlineComm;
import com.house.Dao.OnlineCommMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-01-26 18:11
 */
@Service
public class OnlineCommImpl implements OnlineCommService{
    @Autowired
    OnlineCommMapper onlineCommMapper;
    @Override
    public List<OnlineComm> selectAll(String status) {
        return onlineCommMapper.selectAllByStatus(status);
    }

    @Override
    public void insertOnlineComm(OnlineComm onlineComm) {
        onlineCommMapper.insertSelective(onlineComm);
    }

    @Override
    public void updateOnlineComm(OnlineComm onlineComm) {
        onlineCommMapper.updateByPrimaryKeySelective(onlineComm);
    }

    @Override
    public OnlineComm selectOneOnlineComm(int id) {
        return onlineCommMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<OnlineComm> selectBlurry(String blurry) {
        return onlineCommMapper.selectBlurry(blurry);
    }

    @Override
    public int selectAllPn(String dealStatus) {
        return onlineCommMapper.selectAllPn(dealStatus)/20+1;
    }
}
