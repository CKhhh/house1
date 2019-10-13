package com.house.Bean;

import java.util.Date;

public class OnlineComm {
    private Integer id;

    private String name;

    private String phone;

    private String type;

    private String area;

    public OnlineComm(){}
    public OnlineComm(Integer id, String name, String phone, String type, String area, String address, String year, String dealPerson, String dealStatus, Date dealTime, String dealNote) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.type = type;
        this.area = area;
        this.address = address;
        this.year = year;
        this.dealPerson = dealPerson;
        this.dealStatus = dealStatus;
        this.dealTime = dealTime;
        this.dealNote = dealNote;
    }

    private String address;

    private String year;

    private String dealPerson;

    private String dealStatus;

    private Date dealTime;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getDealPerson() {
        return dealPerson;
    }

    public void setDealPerson(String dealPerson) {
        this.dealPerson = dealPerson == null ? null : dealPerson.trim();
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

    public String getDealNote() {
        return dealNote;
    }

    public void setDealNote(String dealNote) {
        this.dealNote = dealNote == null ? null : dealNote.trim();
    }
}