package com.house.Service.Application;

import com.house.Bean.Application;

import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-01-23 12:14
 */
public interface ApplicationService {
    public void insertApplication(Application application);
    public Application selectOwnApplication(int id);
    public List<Application> adminApplication(String stauts);
    public List<Application> masterApplication(String status,String branch);
    public List<Application> managerApplication(String status,String branch,String depa);
    public void dealApplication(Application application);
    public boolean idIsExist(int id);
}
