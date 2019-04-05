package com.ws.GreenDao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Catalog {
    private Integer id;

    private Integer specialitiesid;

    private Integer chapterid;

    private String chapter;

    @Generated(hash = 42661392)
    public Catalog(Integer id, Integer specialitiesid, Integer chapterid,
            String chapter) {
        this.id = id;
        this.specialitiesid = specialitiesid;
        this.chapterid = chapterid;
        this.chapter = chapter;
    }

    @Generated(hash = 861357461)
    public Catalog() {
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

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }
}