package com.house.Service.Listing;

import com.house.Bean.Listing;
import com.house.Dao.ListingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-01-27 15:29
 */
@Service
public class ListingImpl implements ListingService {
    @Autowired
    ListingMapper listingMapper;
    @Override
    public List<Listing> selectAll() {
        return listingMapper.selectAll();
    }

    @Override
    public void insertListing(Listing listing) {
        listingMapper.insertSelective(listing);
    }

    @Override
    public List<Listing> selectBlurry(String blurry) {
        return listingMapper.selectBlurry(blurry);
    }

    @Override
    public int selectAllPn() {
        return listingMapper.selectAllPn()/20+1;
    }

    @Override
    public Listing selectOne(int id) {
        return listingMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Listing> selectAllByStatement(int listingId, String branch, String department,
                                              String area, String community, String borrowType,
                                              String houseType,String listingStatus) {
        return listingMapper.selectAllByStatement(2,branch,department,area,community,borrowType,houseType,listingStatus);
    }

    @Override
    public void updateListing(Listing listing) {
        listingMapper.updateByPrimaryKeySelective(listing);
    }

    @Override
    public String selectAddressByListingId(String listingId) {
        return listingMapper.selectAddressByLisitngId(listingId);
    }

    @Override
    public List<String> selectListingIdByOther(String branch, String department) {
        return listingMapper.selectListingIdByOther(branch,department);
    }

    @Override
    public List<Listing> selectAllByListingId(String listingId) {
        return listingMapper.selectAllByListingId(listingId);
    }

    @Override
    public void updateListingStatus(String status, int id) {
        listingMapper.updateListingStatusById(status,id);
    }
}
