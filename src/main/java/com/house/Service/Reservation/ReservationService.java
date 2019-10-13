package com.house.Service.Reservation;

import com.house.Bean.Reservation;

import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-01-26 19:58
 */
public interface ReservationService {
    List<Reservation> selectByStatus(String status);
    List<Reservation> selectBlurry(String blurry);
    Reservation selectOneReservation(int id);
    void updateReservation(Reservation reservation);
    void insertReservation(Reservation reservation);
    int selectAllPn(String status);
}
