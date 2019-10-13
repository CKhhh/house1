package com.house.Service.Application;

import com.house.Bean.Application;
import com.house.Dao.ApplicationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-01-23 12:15
 */
@Service
public class ApplicationImpl implements ApplicationService {
    @Autowired
    ApplicationMapper applicationMapper;
    public void insertApplication(Application application) {
     applicationMapper.insert(application);
    }

    public List<Application> selectOwnApplication(int id) {
        return applicationMapper.selectOwnApplication(id);
    }

    public List<Application> adminApplication(String stauts) {
        return applicationMapper.adminSelect(stauts);
    }

    public List<Application> masterApplication(String status, String branch) {
        return applicationMapper.masterSelect(status,branch);
    }

    public List<Application> managerApplication(String status, String branch, String depa) {
        return applicationMapper.managerSelect(status,branch,depa);
    }

    @Override
    public void dealApplication(Application application) {
        applicationMapper.updateByPrimaryKeySelective(application);
    }


    @Override
    public boolean idIsExist(int id) {
        if (applicationMapper.idIsExist(id)!=null){
            return false;
        }
        return true;
    }

    @Override
    public List<Application> selectBlurry(String blurry) {
        return applicationMapper.selectBlurry(blurry);
    }

    @Override
    public int selectAllPn() {
        return applicationMapper.selectAllPn()/20+1;
    }

    @Override
    public List<Application> selectByOther(String branch, String depa) {
        return applicationMapper.selectByOther(branch,depa);
    }
}
