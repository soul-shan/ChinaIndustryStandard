package com.ws.GreenDao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class User {

    private int id;

    private String phone;

    private String password;

    private String imei;

    private String company;

    @Generated(hash = 600953009)
    public User(int id, String phone, String password, String imei,
            String company) {
        this.id = id;
        this.phone = phone;
        this.password = password;
        this.imei = imei;
        this.company = company;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImei() {
        return this.imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


}