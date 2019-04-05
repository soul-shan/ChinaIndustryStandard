package com.ws.GreenDao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

@Entity
public class Specialities {

    private int id;

    private String name;

    private String tb;

    private String code;

    @Generated(hash = 1447233370)
    public Specialities(int id, String name, String tb, String code) {
        this.id = id;
        this.name = name;
        this.tb = tb;
        this.code = code;
    }

    @Generated(hash = 1554114766)
    public Specialities() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTb() {
        return this.tb;
    }

    public void setTb(String tb) {
        this.tb = tb;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Specialities{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tb='" + tb + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}