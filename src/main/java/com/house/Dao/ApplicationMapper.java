package com.house.Dao;

import com.house.Bean.Application;
import com.house.Bean.ApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationMapper {
    long countByExample(ApplicationExample example);

    int deleteByExample(ApplicationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Application record);

    int insertSelective(Application record);

    List<Application> selectByExample(ApplicationExample example);

    Application selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Application record, @Param("example") ApplicationExample example);

    int updateByExample(@Param("record") Application record, @Param("example") ApplicationExample example);

    int updateByPrimaryKeySelective(Application record);

    int updateByPrimaryKey(Application record);

    Application selectOwnApplication(int personId);

    List<Application> adminSelect(String status);

    List<Application> masterSelect(@Param("applicationStatus")String applicationStatus,@Param("applicationBranch")String applicationBranch);

    List<Application> managerSelect(@Param("applicationStatus")String applicationStatus,@Param("applicationBranch")String applicationBranch,@Param("applicationDepa")String applicationDepa);

    void dealApplication(@Param("applicationStatus")String applicationStatus,@Param("id") int id);
    Application idIsExist(int id);
}