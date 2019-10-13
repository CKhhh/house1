package com.house.Service.Repair;

import com.house.Bean.Repair;

import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-01-26 18:52
 */
public interface RepairService {
    List<Repair> selectAll(String status);
    List<Repair> selectBlurry(String blurry);
    Repair selectOneRepair(int id);
    void updateRepair(Repair repair);
    void insertRepair(Repair repair);
    int selectAllPn(String status);

}
