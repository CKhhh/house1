package com.house.Service.Reservation;

import com.house.Bean.Reservation;
import com.house.Dao.RepairMapper;
import com.house.Dao.ReservationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-01-26 19:58
 */
@Service
public class ReservationImpl implements ReservationService {
    @Autowired
    ReservationMapper reservationMapper;
    @Override
    public List<Reservation> selectByStatus(String status) {
        return  reservationMapper.selectByStatus(status);
    }

    @Override
    public List<Reservation> selectBlurry(String blurry) {
        return reservationMapper.selectBlurry(blurry);
    }

    @Override
    public Reservation selectOneReservation(int id) {
        return reservationMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateReservation(Reservation reservation) {
        reservationMapper.updateByPrimaryKeySelective(reservation);
    }

    @Override
    public void insertReservation(Reservation reservation) {
        reservationMapper.insertSelective(reservation);
    }

    @Override
    public int selectAllPn(String status) {
        return reservationMapper.selectAllPn(status)/20+1;
    }
}
