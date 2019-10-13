package com.house.Dao;

import com.house.Bean.Listing;
import com.house.Bean.ListingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ListingMapper {
    long countByExample(ListingExample example);

    int deleteByExample(ListingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Listing record);

    int insertSelective(Listing record);

    List<Listing> selectByExample(ListingExample example);

    Listing selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Listing record, @Param("example") ListingExample example);

    int updateByExample(@Param("record") Listing record, @Param("example") ListingExample example);

    int updateByPrimaryKeySelective(Listing record);

    int updateByPrimaryKey(Listing record);
    List<Listing> selectAll();

    List<Listing> selectBlurry(String blurry);
    int selectAllPn();

    List<Listing> selectAllByStatement(@Param("listingId") int s,
                                       @Param("branch") String branch,
                                       @Param("department") String department,
                                       @Param("area") String area,
                                       @Param("community") String coummnity,
                                       @Param("borrowType") String borrowType,
                                       @Param("houseType") String houseType,
                                       @Param("listingStatus") String listingStatus);
    String selectAddressByLisitngId(String listingId);
    List<String> selectListingIdByOther(@Param("branch")String branch,
                                        @Param("department")String department);
    List<Listing> selectAllByListingId(String listingId);
    void updateListingStatusById(@Param("status")String status,
                                 @Param("id") int id);
}