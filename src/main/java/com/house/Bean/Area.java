package com.house.Bean;

public class Area {
    private Integer areaId;

    private String areaName;

    private String community;

    public Area(Integer areaId, String areaName, String community) {
        this.areaId = areaId;
        this.areaName = areaName;
        this.community = community;
    }

    public Area() {
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community == null ? null : community.trim();
    }
}