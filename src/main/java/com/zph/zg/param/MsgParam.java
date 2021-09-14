package com.zph.zg.param;

import com.zph.zg.base.param.BaseParam;

import java.io.Serializable;

public class MsgParam extends BaseParam implements Serializable {
    private String persId;
    private String operateTime;
    private String persName;
    private String mobile;
    private double lon;
    private double lat;
    private String address;
    private String orgId;
    private String groupId;
    private String adCode;
    public MsgParam(){}

    public String getPersId() {
        return persId;
    }

    public void setPersId(String persId) {
        this.persId = persId;
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public String getPersName() {
        return persName;
    }

    public void setPersName(String persName) {
        this.persName = persName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getAdCode() {
        return adCode;
    }

    public void setAdCode(String adCode) {
        this.adCode = adCode;
    }
}
