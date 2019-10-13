package com.house.Bean;

import java.math.BigDecimal;
import java.util.Date;

public class Room {
    private Integer id;

    private String listingId;

    private String roomId;

    private String status;

    private Date statusDate;

    private Integer contractId;

    private String pricing;

    private String business;

    private BigDecimal payRoomPrice;

    private String diposit;

    private BigDecimal servicePrice;

    private String paymentStyle;

    private String tenantName;

    private String tenantPhone;

    private String tenantCard;

    private String tenantSex;

    private String tenantImName;

    private String tenantImPhone;

    private Date startTime;

    private Date endTime;

    private String arrears;

    private Date arrearsEndTime;

    private String contractType;

    private String uniBath;

    private String uniBalcony;

    private String transferBaseWater;

    private String transferBaseElectricity;

    private String transferBaseGas;

    private String transferBaseEleHigh;

    private String transferBaseEleLow;

    private String transferBaseEleForm;

    private String listingConfig;

    private String contractNote;

    private String roomNote;

    private String financeNote;

    private String paymentPlan;

    private String tenantPic;

    private String acreage;

    private String face;

    public Room(Integer id, String listingId, String roomId, String status, Date statusDate,
                Integer contractId, String pricing, String business, BigDecimal payRoomPrice,
                String diposit, BigDecimal servicePrice, String paymentStyle, String tenantName,
                String tenantPhone, String tenantCard, String tenantSex, String tenantImName,
                String tenantImPhone, Date startTime, Date endTime, String arrears, Date arrearsEndTime,
                String contractType, String uniBath, String uniBalcony, String transferBaseWater, String transferBaseElectricity,
                String transferBaseGas, String transferBaseEleHigh, String transferBaseEleLow, String transferBaseEleForm,
                String listingConfig, String contractNote, String roomNote, String financeNote, String paymentPlan, String tenantPic, String acreage, String face) {
        this.id = id;
        this.listingId = listingId;
        this.roomId = roomId;
        this.status = status;
        this.statusDate = statusDate;
        this.contractId = contractId;
        this.pricing = pricing;
        this.business = business;
        this.payRoomPrice = payRoomPrice;
        this.diposit = diposit;
        this.servicePrice = servicePrice;
        this.paymentStyle = paymentStyle;
        this.tenantName = tenantName;
        this.tenantPhone = tenantPhone;
        this.tenantCard = tenantCard;
        this.tenantSex = tenantSex;
        this.tenantImName = tenantImName;
        this.tenantImPhone = tenantImPhone;
        this.startTime = startTime;
        this.endTime = endTime;
        this.arrears = arrears;
        this.arrearsEndTime = arrearsEndTime;
        this.contractType = contractType;
        this.uniBath = uniBath;
        this.uniBalcony = uniBalcony;
        this.transferBaseWater = transferBaseWater;
        this.transferBaseElectricity = transferBaseElectricity;
        this.transferBaseGas = transferBaseGas;
        this.transferBaseEleHigh = transferBaseEleHigh;
        this.transferBaseEleLow = transferBaseEleLow;
        this.transferBaseEleForm = transferBaseEleForm;
        this.listingConfig = listingConfig;
        this.contractNote = contractNote;
        this.roomNote = roomNote;
        this.financeNote = financeNote;
        this.paymentPlan = paymentPlan;
        this.tenantPic = tenantPic;
        this.acreage = acreage;
        this.face = face;
    }

    public Room() {
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getPricing() {
        return pricing;
    }

    public void setPricing(String pricing) {
        this.pricing = pricing == null ? null : pricing.trim();
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business == null ? null : business.trim();
    }

    public BigDecimal getPayRoomPrice() {
        return payRoomPrice;
    }

    public void setPayRoomPrice(BigDecimal payRoomPrice) {
        this.payRoomPrice = payRoomPrice;
    }

    public String getDiposit() {
        return diposit;
    }

    public void setDiposit(String diposit) {
        this.diposit = diposit == null ? null : diposit.trim();
    }

    public BigDecimal getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(BigDecimal servicePrice) {
        this.servicePrice = servicePrice;
    }

    public String getPaymentStyle() {
        return paymentStyle;
    }

    public void setPaymentStyle(String paymentStyle) {
        this.paymentStyle = paymentStyle == null ? null : paymentStyle.trim();
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

    public String getTenantCard() {
        return tenantCard;
    }

    public void setTenantCard(String tenantCard) {
        this.tenantCard = tenantCard == null ? null : tenantCard.trim();
    }

    public String getTenantSex() {
        return tenantSex;
    }

    public void setTenantSex(String tenantSex) {
        this.tenantSex = tenantSex == null ? null : tenantSex.trim();
    }

    public String getTenantImName() {
        return tenantImName;
    }

    public void setTenantImName(String tenantImName) {
        this.tenantImName = tenantImName == null ? null : tenantImName.trim();
    }

    public String getTenantImPhone() {
        return tenantImPhone;
    }

    public void setTenantImPhone(String tenantImPhone) {
        this.tenantImPhone = tenantImPhone == null ? null : tenantImPhone.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getArrears() {
        return arrears;
    }

    public void setArrears(String arrears) {
        this.arrears = arrears == null ? null : arrears.trim();
    }

    public Date getArrearsEndTime() {
        return arrearsEndTime;
    }

    public void setArrearsEndTime(Date arrearsEndTime) {
        this.arrearsEndTime = arrearsEndTime;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType == null ? null : contractType.trim();
    }

    public String getUniBath() {
        return uniBath;
    }

    public void setUniBath(String uniBath) {
        this.uniBath = uniBath == null ? null : uniBath.trim();
    }

    public String getUniBalcony() {
        return uniBalcony;
    }

    public void setUniBalcony(String uniBalcony) {
        this.uniBalcony = uniBalcony == null ? null : uniBalcony.trim();
    }

    public String getTransferBaseWater() {
        return transferBaseWater;
    }

    public void setTransferBaseWater(String transferBaseWater) {
        this.transferBaseWater = transferBaseWater == null ? null : transferBaseWater.trim();
    }

    public String getTransferBaseElectricity() {
        return transferBaseElectricity;
    }

    public void setTransferBaseElectricity(String transferBaseElectricity) {
        this.transferBaseElectricity = transferBaseElectricity == null ? null : transferBaseElectricity.trim();
    }

    public String getTransferBaseGas() {
        return transferBaseGas;
    }

    public void setTransferBaseGas(String transferBaseGas) {
        this.transferBaseGas = transferBaseGas == null ? null : transferBaseGas.trim();
    }

    public String getTransferBaseEleHigh() {
        return transferBaseEleHigh;
    }

    public void setTransferBaseEleHigh(String transferBaseEleHigh) {
        this.transferBaseEleHigh = transferBaseEleHigh == null ? null : transferBaseEleHigh.trim();
    }

    public String getTransferBaseEleLow() {
        return transferBaseEleLow;
    }

    public void setTransferBaseEleLow(String transferBaseEleLow) {
        this.transferBaseEleLow = transferBaseEleLow == null ? null : transferBaseEleLow.trim();
    }

    public String getTransferBaseEleForm() {
        return transferBaseEleForm;
    }

    public void setTransferBaseEleForm(String transferBaseEleForm) {
        this.transferBaseEleForm = transferBaseEleForm == null ? null : transferBaseEleForm.trim();
    }

    public String getListingConfig() {
        return listingConfig;
    }

    public void setListingConfig(String listingConfig) {
        this.listingConfig = listingConfig == null ? null : listingConfig.trim();
    }

    public String getContractNote() {
        return contractNote;
    }

    public void setContractNote(String contractNote) {
        this.contractNote = contractNote == null ? null : contractNote.trim();
    }

    public String getRoomNote() {
        return roomNote;
    }

    public void setRoomNote(String roomNote) {
        this.roomNote = roomNote == null ? null : roomNote.trim();
    }

    public String getFinanceNote() {
        return financeNote;
    }

    public void setFinanceNote(String financeNote) {
        this.financeNote = financeNote == null ? null : financeNote.trim();
    }

    public String getPaymentPlan() {
        return paymentPlan;
    }

    public void setPaymentPlan(String paymentPlan) {
        this.paymentPlan = paymentPlan == null ? null : paymentPlan.trim();
    }

    public String getTenantPic() {
        return tenantPic;
    }

    public void setTenantPic(String tenantPic) {
        this.tenantPic = tenantPic == null ? null : tenantPic.trim();
    }

    public String getAcreage() {
        return acreage;
    }

    public void setAcreage(String acreage) {
        this.acreage = acreage == null ? null : acreage.trim();
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face == null ? null : face.trim();
    }
}