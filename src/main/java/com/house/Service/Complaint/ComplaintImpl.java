package com.house.Service.Complaint;

import com.house.Bean.Complaint;
import com.house.Dao.ComplaintMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-01-26 12:09
 */
@Service
public class ComplaintImpl implements ComplaintService {
    @Autowired
    ComplaintMapper complaintMapper;
    @Override
    public List<Complaint> selectAll(String status) {
        return complaintMapper.selectAllByStatus(status);
    }

    @Override
    public void insertComplaint(Complaint complaint) {
        complaintMapper.insertSelective(complaint);
    }

    @Override
    public void updateComplaint(Complaint complaint) {
        complaintMapper.updateByPrimaryKeySelective(complaint);
    }

    @Override
    public Complaint selectOne(int id) {
        return complaintMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Complaint> selectBlurry(String blurry) {
        return complaintMapper.selectBlurry(blurry);
    }

    @Override
    public int selectAllPn(String dealStatus) {
        return complaintMapper.selectAllPn(dealStatus)/20+1;
    }

}
