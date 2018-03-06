package com.bao.ssm.po;

public class Commodity {
    private Integer commodityId;

    private String commodityName;

    private String commodityType;

    private String commodityCover;

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public String getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(String commodityType) {
        this.commodityType = commodityType == null ? null : commodityType.trim();
    }

    public String getCommodityCover() {
        return commodityCover;
    }

    public void setCommodityCover(String commodityCover) {
        this.commodityCover = commodityCover == null ? null : commodityCover.trim();
    }
}