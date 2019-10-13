package com.house.Bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Complaint {
    private Integer id;

    private String complaintName;

    private String complaintPhone;
    @DateTimeFormat(pattern = "yyyy-MM-dd")

    private Date complaintTime;

    private String roomAddress;

    private String complaintThing;

    private String dealPerson;

    private String dealStatus;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date dealTime;

    private String dealNote;

    public Integer getId() {
        return id;
    }
    public Complaint(){

    }
    public Complaint(Integer id, String complaintName, String complaintPhone, Date complaintTime, String roomAddress, String complaintThing, String dealPerson, String dealStatus, Date dealTime, String dealNote) {
        this.id = id;
        this.complaintName = complaintName;
        this.complaintPhone = complaintPhone;
        this.complaintTime = complaintTime;
        this.roomAddress = roomAddress;
        this.complaintThing = complaintThing;
        this.dealPerson = dealPerson;
        this.dealStatus = dealStatus;
        this.dealTime = dealTime;
        this.dealNote = dealNote;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComplaintName() {
        return complaintName;
    }

    public void setComplaintName(String complaintName) {
        this.complaintName = complaintName == null ? null : complaintName.trim();
    }

    public String getComplaintPhone() {
        return complaintPhone;
    }

    public void setComplaintPhone(String complaintPhone) {
        this.complaintPhone = complaintPhone == null ? null : complaintPhone.trim();
    }

    public Date getComplaintTime() {
        return complaintTime;
    }

    public void setComplaintTime(Date complaintTime) {
        this.complaintTime = complaintTime;
    }

    public String getRoomAddress() {
        return roomAddress;
    }

    public void setRoomAddress(String roomAddress) {
        this.roomAddress = roomAddress == null ? null : roomAddress.trim();
    }

    public String getComplaintThing() {
        return complaintThing;
    }

    public void setComplaintThing(String complaintThing) {
        this.complaintThing = complaintThing == null ? null : complaintThing.trim();
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