package com.house.Service.Repair;

import com.house.Bean.Repair;
import com.house.Dao.RepairMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-01-26 18:52
 */
@Service
public class RepairImpl implements RepairService{
    @Autowired
    RepairMapper repairMapper;
    @Override
    public List<Repair> selectAll(String status) {
        return repairMapper.selectAllByStatus(status);
    }

    @Override
    public List<Repair> selectBlurry( String blurry) {
        return repairMapper.selectBlurry(blurry);
    }

    @Override
    public Repair selectOneRepair(int id) {
        return repairMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateRepair(Repair repair) {
        repairMapper.updateByPrimaryKeySelective(repair);
    }

    @Override
    public void insertRepair(Repair repair) {
        repairMapper.insertSelective(repair);
    }

    @Override
    public int selectAllPn(String status) {
        return repairMapper.selectAllPn(status)/20+1;
    }
}
