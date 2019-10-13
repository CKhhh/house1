package com.house.Bean;

import java.math.BigDecimal;
import java.util.Date;

public class Listing {
    private Integer id;

    private String listingId;

    private Integer contractId;

    private String branch;

    private String department;

    private String area;

    private String community;

    private String houseManage;

    private String secretarial;

    private String houseType;

    private String floor;

    private String elevator;

    private String acreage;

    private String borrowType;

    private String address;

    private Date startTime;

    private Date endTime;

    private String freeRentMsg;

    private BigDecimal housePrice;

    private String deposit;

    private String ownerName;

    private String ownerPhone;

    private String ownerCard;

    private String paymentStyle1;

    private String paymentMsg;

    private String waterCard;

    private String paymentCycleWater;

    private String waterDay;

    private String electricityCard;

    private String paymentCycleElectricity;

    private String electricityDay;

    private String gasCard;

    private String paymentCycleGas;

    private String gasDay;

    private String transferBaseWater;

    private String transferBaseElectricity;

    private String transferBaseGas;

    private String transferBaseEleHigh;

    private String transferBaseEleLow;

    private String listingConfig;

    private String contractNote;

    private String listingNote;

    private String financeNote;

    private String listingDescription;

    private String paymentPlan;

    private String listingPic;

    private String ownerPic;

    private String broadbandMsg;

    private String listingStatus;

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

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community == null ? null : community.trim();
    }

    public String getHouseManage() {
        return houseManage;
    }

    public void setHouseManage(String houseManage) {
        this.houseManage = houseManage == null ? null : houseManage.trim();
    }

    public String getSecretarial() {
        return secretarial;
    }

    public void setSecretarial(String secretarial) {
        this.secretarial = secretarial == null ? null : secretarial.trim();
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType == null ? null : houseType.trim();
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }

    public String getElevator() {
        return elevator;
    }

    public void setElevator(String elevator) {
        this.elevator = elevator == null ? null : elevator.trim();
    }

    public String getAcreage() {
        return acreage;
    }

    public void setAcreage(String acreage) {
        this.acreage = acreage == null ? null : acreage.trim();
    }

    public String getBorrowType() {
        return borrowType;
    }

    public void setBorrowType(String borrowType) {
        this.borrowType = borrowType == null ? null : borrowType.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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

    public String getFreeRentMsg() {
        return freeRentMsg;
    }

    public void setFreeRentMsg(String freeRentMsg) {
        this.freeRentMsg = freeRentMsg == null ? null : freeRentMsg.trim();
    }

    public BigDecimal getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(BigDecimal housePrice) {
        this.housePrice = housePrice;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit == null ? null : deposit.trim();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName == null ? null : ownerName.trim();
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone == null ? null : ownerPhone.trim();
    }

    public String getOwnerCard() {
        return ownerCard;
    }

    public void setOwnerCard(String ownerCard) {
        this.ownerCard = ownerCard == null ? null : ownerCard.trim();
    }

    public String getPaymentStyle1() {
        return paymentStyle1;
    }

    public void setPaymentStyle1(String paymentStyle1) {
        this.paymentStyle1 = paymentStyle1 == null ? null : paymentStyle1.trim();
    }

    public String getPaymentMsg() {
        return paymentMsg;
    }

    public void setPaymentMsg(String paymentMsg) {
        this.paymentMsg = paymentMsg == null ? null : paymentMsg.trim();
    }

    public String getWaterCard() {
        return waterCard;
    }

    public void setWaterCard(String waterCard) {
        this.waterCard = waterCard == null ? null : waterCard.trim();
    }

    public String getPaymentCycleWater() {
        return paymentCycleWater;
    }

    public void setPaymentCycleWater(String paymentCycleWater) {
        this.paymentCycleWater = paymentCycleWater == null ? null : paymentCycleWater.trim();
    }

    public String getWaterDay() {
        return waterDay;
    }

    public void setWaterDay(String waterDay) {
        this.waterDay = waterDay == null ? null : waterDay.trim();
    }

    public String getElectricityCard() {
        return electricityCard;
    }

    public void setElectricityCard(String electricityCard) {
        this.electricityCard = electricityCard == null ? null : electricityCard.trim();
    }

    public String getPaymentCycleElectricity() {
        return paymentCycleElectricity;
    }

    public void setPaymentCycleElectricity(String paymentCycleElectricity) {
        this.paymentCycleElectricity = paymentCycleElectricity == null ? null : paymentCycleElectricity.trim();
    }

    public String getElectricityDay() {
        return electricityDay;
    }

    public void setElectricityDay(String electricityDay) {
        this.electricityDay = electricityDay == null ? null : electricityDay.trim();
    }

    public String getGasCard() {
        return gasCard;
    }

    public void setGasCard(String gasCard) {
        this.gasCard = gasCard == null ? null : gasCard.trim();
    }

    public String getPaymentCycleGas() {
        return paymentCycleGas;
    }

    public void setPaymentCycleGas(String paymentCycleGas) {
        this.paymentCycleGas = paymentCycleGas == null ? null : paymentCycleGas.trim();
    }

    public String getGasDay() {
        return gasDay;
    }

    public void setGasDay(String gasDay) {
        this.gasDay = gasDay == null ? null : gasDay.trim();
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

    public String getListingNote() {
        return listingNote;
    }

    public void setListingNote(String listingNote) {
        this.listingNote = listingNote == null ? null : listingNote.trim();
    }

    public String getFinanceNote() {
        return financeNote;
    }

    public void setFinanceNote(String financeNote) {
        this.financeNote = financeNote == null ? null : financeNote.trim();
    }

    public String getListingDescription() {
        return listingDescription;
    }

    public void setListingDescription(String listingDescription) {
        this.listingDescription = listingDescription == null ? null : listingDescription.trim();
    }

    public String getPaymentPlan() {
        return paymentPlan;
    }

    public void setPaymentPlan(String paymentPlan) {
        this.paymentPlan = paymentPlan == null ? null : paymentPlan.trim();
    }

    public String getListingPic() {
        return listingPic;
    }

    public void setListingPic(String listingPic) {
        this.listingPic = listingPic == null ? null : listingPic.trim();
    }

    public String getOwnerPic() {
        return ownerPic;
    }

    public void setOwnerPic(String ownerPic) {
        this.ownerPic = ownerPic == null ? null : ownerPic.trim();
    }

    public String getBroadbandMsg() {
        return broadbandMsg;
    }

    public Listing() {
    }

    public void setBroadbandMsg(String broadbandMsg) {
        this.broadbandMsg = broadbandMsg == null ? null : broadbandMsg.trim();
    }

    public Listing(Integer id, String listingId, Integer contractId, String branch, String department, String area, String community, String houseManage, String secretarial, String houseType, String floor, String elevator, String acreage, String borrowType, String address, Date startTime, Date endTime, String freeRentMsg, BigDecimal housePrice, String deposit, String ownerName, String ownerPhone, String ownerCard, String paymentStyle1, String paymentMsg, String waterCard, String paymentCycleWater, String waterDay, String electricityCard, String paymentCycleElectricity, String electricityDay, String gasCard, String paymentCycleGas, String gasDay, String transferBaseWater, String transferBaseElectricity, String transferBaseGas, String transferBaseEleHigh, String transferBaseEleLow, String listingConfig, String contractNote, String listingNote, String financeNote, String listingDescription, String paymentPlan, String listingPic, String ownerPic, String broadbandMsg, String listingStatus) {
        this.id = id;
        this.listingId = listingId;
        this.contractId = contractId;
        this.branch = branch;
        this.department = department;
        this.area = area;
        this.community = community;
        this.houseManage = houseManage;
        this.secretarial = secretarial;
        this.houseType = houseType;
        this.floor = floor;
        this.elevator = elevator;
        this.acreage = acreage;
        this.borrowType = borrowType;
        this.address = address;
        this.startTime = startTime;
        this.endTime = endTime;
        this.freeRentMsg = freeRentMsg;
        this.housePrice = housePrice;
        this.deposit = deposit;
        this.ownerName = ownerName;
        this.ownerPhone = ownerPhone;
        this.ownerCard = ownerCard;
        this.paymentStyle1 = paymentStyle1;
        this.paymentMsg = paymentMsg;
        this.waterCard = waterCard;
        this.paymentCycleWater = paymentCycleWater;
        this.waterDay = waterDay;
        this.electricityCard = electricityCard;
        this.paymentCycleElectricity = paymentCycleElectricity;
        this.electricityDay = electricityDay;
        this.gasCard = gasCard;
        this.paymentCycleGas = paymentCycleGas;
        this.gasDay = gasDay;
        this.transferBaseWater = transferBaseWater;
        this.transferBaseElectricity = transferBaseElectricity;
        this.transferBaseGas = transferBaseGas;
        this.transferBaseEleHigh = transferBaseEleHigh;
        this.transferBaseEleLow = transferBaseEleLow;
        this.listingConfig = listingConfig;
        this.contractNote = contractNote;
        this.listingNote = listingNote;
        this.financeNote = financeNote;
        this.listingDescription = listingDescription;
        this.paymentPlan = paymentPlan;
        this.listingPic = listingPic;
        this.ownerPic = ownerPic;
        this.broadbandMsg = broadbandMsg;
        this.listingStatus = listingStatus;
    }

    public String getListingStatus() {
        return listingStatus;
    }

    public void setListingStatus(String listingStatus) {
        this.listingStatus = listingStatus == null ? null : listingStatus.trim();
    }
}