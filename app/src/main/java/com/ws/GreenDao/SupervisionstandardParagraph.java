package com.ws.GreenDao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class SupervisionstandardParagraph {
    private Integer id;

    private Integer chapterid;

    private Integer partid;

    private Integer paragraphid;

    private String paragraphname;

    private String paragraph;

    private String nspectionquantity;

    private String inspectionmethod;

    @Generated(hash = 616059962)
    public SupervisionstandardParagraph(Integer id, Integer chapterid,
            Integer partid, Integer paragraphid, String paragraphname,
            String paragraph, String nspectionquantity, String inspectionmethod) {
        this.id = id;
        this.chapterid = chapterid;
        this.partid = partid;
        this.paragraphid = paragraphid;
        this.paragraphname = paragraphname;
        this.paragraph = paragraph;
        this.nspectionquantity = nspectionquantity;
        this.inspectionmethod = inspectionmethod;
    }

    @Generated(hash = 465343620)
    public SupervisionstandardParagraph() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getParagraphname() {
        return paragraphname;
    }

    public void setParagraphname(String paragraphname) {
        this.paragraphname = paragraphname;
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    public String getNspectionquantity() {
        return nspectionquantity;
    }

    public void setNspectionquantity(String nspectionquantity) {
        this.nspectionquantity = nspectionquantity;
    }

    public String getInspectionmethod() {
        return inspectionmethod;
    }

    public void setInspectionmethod(String inspectionmethod) {
        this.inspectionmethod = inspectionmethod;
    }
}