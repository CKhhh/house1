package com.house.Bean;

import java.util.Date;

public class Reservation {
    private Integer id;

    private String name;

    private String phone;

    public Reservation(Integer id, String name, String phone, Date time, String area, String note, String dealStatus, Date dealTime, String dealPerson, String dealNote) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.time = time;
        this.area = area;
        this.note = note;
        this.dealStatus = dealStatus;
        this.dealTime = dealTime;
        this.dealPerson = dealPerson;
        this.dealNote = dealNote;
    }
    public Reservation (){}
    private Date time;

    private String area;

    private String note;

    private String dealStatus;

    private Date dealTime;

    private String dealPerson;

    private String dealNote;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus == null ? null : dealStatus.trim();
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getDealPerson() {
        return dealPerson;
    }

    public void setDealPerson(String dealPerson) {
        this.dealPerson = dealPerson == null ? null : dealPerson.trim();
    }

    public String getDealNote() {
        return dealNote;
    }

    public void setDealNote(String dealNote) {
        this.dealNote = dealNote == null ? null : dealNote.trim();
    }
}