package com.house.Service.Complaint;

import com.house.Bean.Complaint;

import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-01-26 12:09
 */
public interface ComplaintService {
     List<Complaint> selectAll(String status);
     void insertComplaint(Complaint complaint);
     void updateComplaint(Complaint complaint);
     Complaint selectOne(int id);
     List<Complaint>selectBlurry(String blurry);
     int selectAllPn(String dealStatus);
}
