package com.zph.zg.model;

import java.io.Serializable;

public class Vip implements Serializable {
    private String phone;
    private String type;
    private String num;
    private String state;
    private String var1;
    private String var2;
    private int id;
    public Vip(){}

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        return var2;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "phone='" + phone + '\'' +
                ", type='" + type + '\'' +
                ", num='" + num + '\'' +
                ", state='" + state + '\'' +
                ", var1='" + var1 + '\'' +
                ", var2='" + var2 + '\'' +
                ", id=" + id +
                '}';
    }
}
