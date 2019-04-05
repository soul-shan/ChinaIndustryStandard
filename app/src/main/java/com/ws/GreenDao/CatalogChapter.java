package com.ws.GreenDao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class CatalogChapter {
    private Integer id;

    private Integer specialitiesid;

    private Integer chapterid;

    private String chapter;

    @Generated(hash = 375842625)
    public CatalogChapter(Integer id, Integer specialitiesid, Integer chapterid,
            String chapter) {
        this.id = id;
        this.specialitiesid = specialitiesid;
        this.chapterid = chapterid;
        this.chapter = chapter;
    }

    @Generated(hash = 798082349)
    public CatalogChapter() {
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

    @Override
    public String toString() {
        return "CatalogChapter{" +
                "id=" + id +
                ", specialitiesid=" + specialitiesid +
                ", chapterid=" + chapterid +
                ", chapter='" + chapter + '\'' +
                '}';
    }
}