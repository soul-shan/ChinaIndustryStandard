package com.ws.GreenDao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Paragraph {
    private Integer id;

    private Integer specialitiesid;

    private Integer chapterid;

    private Integer partid;

    private Integer paragraphid;

    private String paragraph;

    private Integer item;

    @Generated(hash = 802806894)
    public Paragraph(Integer id, Integer specialitiesid, Integer chapterid,
            Integer partid, Integer paragraphid, String paragraph, Integer item) {
        this.id = id;
        this.specialitiesid = specialitiesid;
        this.chapterid = chapterid;
        this.partid = partid;
        this.paragraphid = paragraphid;
        this.paragraph = paragraph;
        this.item = item;
    }

    @Generated(hash = 1886769140)
    public Paragraph() {
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

    public Integer getParagraphid() {
        return paragraphid;
    }

    public void setParagraphid(Integer paragraphid) {
        this.paragraphid = paragraphid;
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }
}