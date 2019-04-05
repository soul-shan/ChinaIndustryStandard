package com.ws.GreenDao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class SignalCatalog {
    private int id;

    private int chapterid;

    private String chapter;

    private int partid;

    private String part;

    @Generated(hash = 900138693)
    public SignalCatalog(int id, int chapterid, String chapter, int partid,
            String part) {
        this.id = id;
        this.chapterid = chapterid;
        this.chapter = chapter;
        this.partid = partid;
        this.part = part;
    }

    @Generated(hash = 1296907684)
    public SignalCatalog() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChapterid() {
        return this.chapterid;
    }

    public void setChapterid(int chapterid) {
        this.chapterid = chapterid;
    }

    public String getChapter() {
        return this.chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public int getPartid() {
        return this.partid;
    }

    public void setPartid(int partid) {
        this.partid = partid;
    }

    public String getPart() {
        return this.part;
    }

    public void setPart(String part) {
        this.part = part;
    }

}