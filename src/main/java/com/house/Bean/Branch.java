package com.house.Bean;

public class Branch {
    private Integer branchId;

    private String branchName;

    private String branchDepa;

    private Integer areaId;

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public Branch() {
    }

    public Branch(Integer branchId, String branchName, String branchDepa, Integer areaId) {

        this.branchId = branchId;
        this.branchName = branchName;
        this.branchDepa = branchDepa;
        this.areaId = areaId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName == null ? null : branchName.trim();
    }

    public String getBranchDepa() {
        return branchDepa;
    }

    public void setBranchDepa(String branchDepa) {
        this.branchDepa = branchDepa == null ? null : branchDepa.trim();
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }
}