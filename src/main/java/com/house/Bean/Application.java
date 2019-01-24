package com.house.Bean;

import java.math.BigDecimal;
import java.util.Date;

public class Application {
    private Integer id;

    private Date applicationTime;

    private String applicationPerson;

    private String applicationBranch;

    private String applicationDepa;

    private String applicationJob;

    private String applicationPro;

    private BigDecimal applicationPrice;

    private String applicationBankcard;

    private String applicationReason;

    private String applicationPic;

    private String applicationStatus;

    private String dealPerson;

    private Date dealTime;

    private String dealPic;

    private String dealNote;

    private Integer applicationPersonId;

    public Application(){}
    public Application(int id,Date applicationTime,String applicationPerson,String applicationBranch,String applicationDepa,String applicationJob,
                       String applicationPro,BigDecimal applicationPrice,String applicationBankcard,String applicationReason,String applicationPic,String applicationStatus,
                       String dealPerson,Date dealTime,String dealPic,String dealNote,int applicationPersonId){
        this.id = id;
        this.applicationPerson = applicationPerson;
        this.applicationBranch = applicationBranch;
        this.applicationBankcard = applicationBankcard;
        this.applicationDepa = applicationDepa;
        this.applicationJob = applicationJob;
        this.applicationPro = applicationPro;
        this.applicationPrice = applicationPrice;
        this.applicationBankcard = applicationBankcard;
        this.applicationReason = applicationReason;
        this.applicationPic = applicationPic;
        this.applicationStatus = applicationStatus;
        this.dealPerson = dealPerson;
        this.dealTime = dealTime;
        this.dealNote = dealNote;
        this.applicationPersonId = applicationPersonId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getApplicationTime() {
        return applicationTime;
    }

    public void setApplicationTime(Date applicationTime) {
        this.applicationTime = applicationTime;
    }

    public String getApplicationPerson() {
        return applicationPerson;
    }

    public void setApplicationPerson(String applicationPerson) {
        this.applicationPerson = applicationPerson == null ? null : applicationPerson.trim();
    }

    public String getApplicationBranch() {
        return applicationBranch;
    }

    public void setApplicationBranch(String applicationBranch) {
        this.applicationBranch = applicationBranch == null ? null : applicationBranch.trim();
    }

    public String getApplicationDepa() {
        return applicationDepa;
    }

    public void setApplicationDepa(String applicationDepa) {
        this.applicationDepa = applicationDepa == null ? null : applicationDepa.trim();
    }

    public String getApplicationJob() {
        return applicationJob;
    }

    public void setApplicationJob(String applicationJob) {
        this.applicationJob = applicationJob == null ? null : applicationJob.trim();
    }

    public String getApplicationPro() {
        return applicationPro;
    }

    public void setApplicationPro(String applicationPro) {
        this.applicationPro = applicationPro == null ? null : applicationPro.trim();
    }

    public BigDecimal getApplicationPrice() {
        return applicationPrice;
    }

    public void setApplicationPrice(BigDecimal applicationPrice) {
        this.applicationPrice = applicationPrice;
    }

    public String getApplicationBankcard() {
        return applicationBankcard;
    }

    public void setApplicationBankcard(String applicationBankcard) {
        this.applicationBankcard = applicationBankcard == null ? null : applicationBankcard.trim();
    }

    public String getApplicationReason() {
        return applicationReason;
    }

    public void setApplicationReason(String applicationReason) {
        this.applicationReason = applicationReason == null ? null : applicationReason.trim();
    }

    public String getApplicationPic() {
        return applicationPic;
    }

    public void setApplicationPic(String applicationPic) {
        this.applicationPic = applicationPic == null ? null : applicationPic.trim();
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus == null ? null : applicationStatus.trim();
    }

    public String getDealPerson() {
        return dealPerson;
    }

    public void setDealPerson(String dealPerson) {
        this.dealPerson = dealPerson == null ? null : dealPerson.trim();
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getDealPic() {
        return dealPic;
    }

    public void setDealPic(String dealPic) {
        this.dealPic = dealPic == null ? null : dealPic.trim();
    }

    public String getDealNote() {
        return dealNote;
    }

    public void setDealNote(String dealNote) {
        this.dealNote = dealNote == null ? null : dealNote.trim();
    }

    public Integer getApplicationPersonId() {
        return applicationPersonId;
    }

    public void setApplicationPersonId(Integer applicationPersonId) {
        this.applicationPersonId = applicationPersonId;
    }
}