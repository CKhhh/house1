package com.house.Service.Listing;

import com.house.Bean.Listing;

import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-01-27 15:29
 */
public interface ListingService {
    public List<Listing> selectAll();
    void insertListing(Listing listing);
    List<Listing> selectBlurry(String blurry);
    int selectAllPn();
    Listing selectOne(int id);
    List<Listing> selectAllByStatement(int listingId, String branch, String department, String area, String community,
                                       String borrowType, String houseType, String listingStatus
    );
    void updateListing(Listing listing);
    String selectAddressByListingId(String listingId);
    List<String> selectListingIdByOther(String branch,String department);
    List<Listing> selectAllByListingId(String listingId);
    void updateListingStatus(String status,int id);
}
