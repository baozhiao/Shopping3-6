package com.bao.ssm.po;

import java.util.Date;

public class Commoditydetail {
    private Integer commoditydetailId;

    private String commoditydetailName;

    private Double commoditydetailPice;

    private Date commoditydetailTime;

    private String commoditydetailHomename;

    private String commoditydetailBewrite;

    private String commoditydetailType;

    private Integer transactionStatus;

    public Integer getCommoditydetailId() {
        return commoditydetailId;
    }

    public void setCommoditydetailId(Integer commoditydetailId) {
        this.commoditydetailId = commoditydetailId;
    }

    public String getCommoditydetailName() {
        return commoditydetailName;
    }

    public void setCommoditydetailName(String commoditydetailName) {
        this.commoditydetailName = commoditydetailName == null ? null : commoditydetailName.trim();
    }

    public Double getCommoditydetailPice() {
        return commoditydetailPice;
    }

    public void setCommoditydetailPice(Double commoditydetailPice) {
        this.commoditydetailPice = commoditydetailPice;
    }

    public Date getCommoditydetailTime() {
        return commoditydetailTime;
    }

    public void setCommoditydetailTime(Date commoditydetailTime) {
        this.commoditydetailTime = commoditydetailTime;
    }

    public String getCommoditydetailHomename() {
        return commoditydetailHomename;
    }

    public void setCommoditydetailHomename(String commoditydetailHomename) {
        this.commoditydetailHomename = commoditydetailHomename == null ? null : commoditydetailHomename.trim();
    }

    public String getCommoditydetailBewrite() {
        return commoditydetailBewrite;
    }

    public void setCommoditydetailBewrite(String commoditydetailBewrite) {
        this.commoditydetailBewrite = commoditydetailBewrite == null ? null : commoditydetailBewrite.trim();
    }

    public String getCommoditydetailType() {
        return commoditydetailType;
    }

    public void setCommoditydetailType(String commoditydetailType) {
        this.commoditydetailType = commoditydetailType == null ? null : commoditydetailType.trim();
    }

    public Integer getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(Integer transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
}