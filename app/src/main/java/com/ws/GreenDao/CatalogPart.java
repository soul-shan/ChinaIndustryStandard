package com.ws.GreenDao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class CatalogPart {
    private Integer id;

    private Integer specialitiesid;

    private Integer chapterid;

    private Integer partid;

    private String part;

    @Generated(hash = 1720832843)
    public CatalogPart(Integer id, Integer specialitiesid, Integer chapterid,
            Integer partid, String part) {
        this.id = id;
        this.specialitiesid = specialitiesid;
        this.chapterid = chapterid;
        this.partid = partid;
        this.part = part;
    }

    @Generated(hash = 1753229607)
    public CatalogPart() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpecialitiesid() {
        return specialitiesid;
    }

    public void setSpecialitiesid(Integer specialitiesid) {
        this.specialitiesid = specialitiesid;
    }

    public Integer getChapterid() {
        return chapterid;
    }

    public void setChapterid(Integer chapterid) {
        this.chapterid = chapterid;
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

    @Override
    public String toString() {
        return "CatalogPart{" +
                "id=" + id +
                ", specialitiesid=" + specialitiesid +
                ", chapterid=" + chapterid +
                ", partid=" + partid +
                ", part='" + part + '\'' +
                '}';
    }
}