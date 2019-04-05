package com.ws.GreenDao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Part {
    private Integer id;

    private Integer catalogid;

    private Integer partid;

    private String part;

    @Generated(hash = 1402742208)
    public Part(Integer id, Integer catalogid, Integer partid, String part) {
        this.id = id;
        this.catalogid = catalogid;
        this.partid = partid;
        this.part = part;
    }

    @Generated(hash = 130301790)
    public Part() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCatalogid() {
        return catalogid;
    }

    public void setCatalogid(Integer catalogid) {
        this.catalogid = catalogid;
    }

    public Integer getPartid() {
        return partid;
    }

    public void setPartid(Integer partid) {
        this.partid = partid;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }
}