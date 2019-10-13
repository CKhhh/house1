package com.house.Bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Repair {
    private Integer id;

    private String tenantName;

    private String tenantPhone;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date repairTime;

    public Repair(){

    }

    public Repair(Integer id, String tenantName, String tenantPhone, Date repairTime, String roomAddress,
                  String repairThing, String repairDescr, String repairPic, String status, String person, String note, Date time) {
        this.id = id;
        this.tenantName = tenantName;
        this.tenantPhone = tenantPhone;
        this.repairTime = repairTime;
        this.roomAddress = roomAddress;
        this.repairThing = repairThing;
        this.repairDescr = repairDescr;
        this.repairPic = repairPic;
        this.status = status;
        this.person = person;
        this.note = note;
        this.time = time;
    }

    private String roomAddress;

    private String repairThing;

    private String repairDescr;

    private String repairPic;

    private String status;

    private String person;

    private String note;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName == null ? null : tenantName.trim();
    }

    public String getTenantPhone() {
        return tenantPhone;
    }

    public void setTenantPhone(String tenantPhone) {
        this.tenantPhone = tenantPhone == null ? null : tenantPhone.trim();
    }

    public Date getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(Date repairTime) {
        this.repairTime = repairTime;
    }

    public String getRoomAddress() {
        return roomAddress;
    }

    public void setRoomAddress(String roomAddress) {
        this.roomAddress = roomAddress == null ? null : roomAddress.trim();
    }

    public String getRepairThing() {
        return repairThing;
    }

    public void setRepairThing(String repairThing) {
        this.repairThing = repairThing == null ? null : repairThing.trim();
    }

    public String getRepairDescr() {
        return repairDescr;
    }

    public void setRepairDescr(String repairDescr) {
        this.repairDescr = repairDescr == null ? null : repairDescr.trim();
    }

    public String getRepairPic() {
        return repairPic;
    }

    public void setRepairPic(String repairPic) {
        this.repairPic = repairPic == null ? null : repairPic.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}