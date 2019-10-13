package com.house.Bean;

import java.util.Date;

public class Deal {
    private Integer id;

    private String listingId;

    private String roomId;

    private String rommAddress;

    private String thing;

    private Date thingTime;

    private String status;

    private String person;

    private Date time;

    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getListingId() {
        return listingId;
    }

    public void setListingId(String listingId) {
        this.listingId = listingId == null ? null : listingId.trim();
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    public String getRommAddress() {
        return rommAddress;
    }

    public void setRommAddress(String rommAddress) {
        this.rommAddress = rommAddress == null ? null : rommAddress.trim();
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing == null ? null : thing.trim();
    }

    public Deal(Integer id, String listingId, String roomId, String rommAddress, String thing,
                Date thingTime, String status, String person, Date time, String note) {
        this.id = id;
        this.listingId = listingId;
        this.roomId = roomId;
        this.rommAddress = rommAddress;
        this.thing = thing;
        this.thingTime = thingTime;
        this.status = status;
        this.person = person;
        this.time = time;
        this.note = note;
    }

    public Deal() {
    }

    public Date getThingTime() {
        return thingTime;
    }

    public void setThingTime(Date thingTime) {
        this.thingTime = thingTime;
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}