package com.house.Service.Room;

import com.house.Bean.Room;

import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-01-29 16:02
 */
public interface RoomService {
    List<Room> selectRoom(String listingId);
    List<Room> selectAll();
    void insertRoom(Room room);
    void updateRoom(Room room);
    Room selectOne(int id);
    int selectStatusByListingId(String listingId);
}
