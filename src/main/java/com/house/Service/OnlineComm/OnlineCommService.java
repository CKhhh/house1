package com.house.Service.OnlineComm;

import com.house.Bean.OnlineComm;

import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-01-26 18:11
 */
public interface OnlineCommService {
    List<OnlineComm> selectAll(String status);
    void insertOnlineComm(OnlineComm onlineComm);
    void updateOnlineComm(OnlineComm onlineComm);
    OnlineComm selectOneOnlineComm(int id);
    List<OnlineComm> selectBlurry(String blurry);
    int selectAllPn(String dealStatus);

}
