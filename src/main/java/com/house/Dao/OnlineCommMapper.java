package com.house.Dao;

import com.house.Bean.OnlineComm;
import com.house.Bean.OnlineCommExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlineCommMapper {
    long countByExample(OnlineCommExample example);

    int deleteByExample(OnlineCommExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OnlineComm record);

    int insertSelective(OnlineComm record);

    List<OnlineComm> selectByExample(OnlineCommExample example);

    OnlineComm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OnlineComm record, @Param("example") OnlineCommExample example);

    int updateByExample(@Param("record") OnlineComm record, @Param("example") OnlineCommExample example);

    int updateByPrimaryKeySelective(OnlineComm record);

    int updateByPrimaryKey(OnlineComm record);

    List<OnlineComm> selectAllByStatus(@Param("dealStatus") String dealStatus);

    List<OnlineComm> selectBlurry(@Param("blurry") String blurry);
    int selectAllPn(String dealStatus);

}