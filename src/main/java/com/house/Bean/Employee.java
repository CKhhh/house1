package com.house.Bean;

public class Employee {
    private Integer empId;

    private String empName;

    private String empPhone;

    private String empBranch;

    private String empPart;

    private String empJob;

    public Employee(){}

    public Employee(Integer empId, String empName, String empPhone, String empBranch,
                    String empPart, String empJob, String empArea, String empEntry, Integer empType, String empUname, String empPassword) {
        this.empId = empId;
        this.empName = empName;
        this.empPhone = empPhone;
        this.empBranch = empBranch;
        this.empPart = empPart;
        this.empJob = empJob;
        this.empArea = empArea;
        this.empEntry = empEntry;
        this.empType = empType;
        this.empUname = empUname;
        this.empPassword = empPassword;
    }

    private String empArea;

    private String empEntry;

    private Integer empType;

    private String empUname;

    private String empPassword;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone == null ? null : empPhone.trim();
    }

    public String getEmpBranch() {
        return empBranch;
    }

    public void setEmpBranch(String empBranch) {
        this.empBranch = empBranch == null ? null : empBranch.trim();
    }

    public String getEmpPart() {
        return empPart;
    }

    public void setEmpPart(String empPart) {
        this.empPart = empPart == null ? null : empPart.trim();
    }

    public String getEmpJob() {
        return empJob;
    }

    public void setEmpJob(String empJob) {
        this.empJob = empJob == null ? null : empJob.trim();
    }

    public String getEmpArea() {
        return empArea;
    }

    public void setEmpArea(String empArea) {
        this.empArea = empArea == null ? null : empArea.trim();
    }

    public String getEmpEntry() {
        return empEntry;
    }

    public void setEmpEntry(String empEntry) {
        this.empEntry = empEntry == null ? null : empEntry.trim();
    }

    public Integer getEmpType() {
        return empType;
    }

    public void setEmpType(Integer empType) {
        this.empType = empType;
    }

    public String getEmpUname() {
        return empUname;
    }

    public void setEmpUname(String empUname) {
        this.empUname = empUname == null ? null : empUname.trim();
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword == null ? null : empPassword.trim();
    }
}