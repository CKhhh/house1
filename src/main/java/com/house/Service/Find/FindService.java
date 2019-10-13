package com.house.Service.Find;

import com.house.Bean.Area;
import com.house.Bean.Branch;

import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-02-01 13:06
 */
public interface FindService {
    List<String> selectAllByName(String name);
    List<Branch> findBranch(String branch);
    List<String> selectAllDistArea();
    List<String> selectAllDistBranch();
    List<String> selectComm();
}
