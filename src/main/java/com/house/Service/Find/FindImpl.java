package com.house.Service.Find;

import com.house.Bean.Area;
import com.house.Bean.Branch;
import com.house.Dao.AreaMapper;
import com.house.Dao.BranchMapper;
import com.house.Dao.CommunityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-02-01 13:06
 */
@Service
public class FindImpl implements FindService {
    @Autowired
    AreaMapper areaMapper;
    @Autowired
    BranchMapper branchMapper;
    @Autowired
    CommunityMapper communityMapper;
    @Override
    public List<String> selectAllByName(String name) {
        return areaMapper.selectAllByName(name);
    }

    @Override
    public List<Branch> findBranch(String branch) {
        return branchMapper.findBranch(branch);
    }

    @Override
    public List<String> selectAllDistArea() {
        return areaMapper.selectAll();
    }

    @Override
    public List<String> selectAllDistBranch() {
        return branchMapper.selectAll();
    }

    @Override
    public List<String> selectComm() {
        return communityMapper.selectDistComm();
    }
}
