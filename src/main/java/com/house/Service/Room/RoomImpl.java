package com.house.Service.Room;

import com.house.Bean.Room;
import com.house.Dao.RoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-01-29 16:02
 */
@Service
public class RoomImpl implements RoomService{
    @Autowired
    RoomMapper roomMapper;
    @Override
    public List<Room> selectRoom(String listingId) {
        return roomMapper.selectByListingId(listingId);
    }

    @Override
    public List<Room> selectAll() {
        return roomMapper.selectAll();
    }

    @Override
    public void insertRoom(Room room) {
        roomMapper.insertSelective(room);
    }

    @Override
    public void updateRoom(Room room) {
        roomMapper.updateByPrimaryKeySelective(room);
    }

    @Override
    public Room selectOne(int id) {
        return roomMapper.selectByPrimaryKey(id);
    }

    @Override
    public int selectStatusByListingId(String listingId) {
       return roomMapper.selectStatusByListingId(listingId);
    }

}
