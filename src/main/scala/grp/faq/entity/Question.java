package grp.faq.entity;

import java.util.Date;

public class Question {
    public Long cQid;

    public Byte cUid;

    public String cQTitle;

    public Byte cClose;

    public Date cCreateTime;

    public String cQContext;

    public Byte cGX;

    public Integer cHot;

    public Question(Long cQid, Byte cUid, String cQTitle, Byte cClose, Date cCreateTime, String cQContext, Byte cGX, Integer cHot) {
        this.cQid = cQid;
        this.cUid = cUid;
        this.cQTitle = cQTitle;
        this.cClose = cClose;
        this.cCreateTime = cCreateTime;
        this.cQContext = cQContext;
        this.cGX = cGX;
        this.cHot = cHot;
    }

    public Question() {
        super();
    }

    public Long getcQid() {
        return cQid;
    }

    public void setcQid(Long cQid) {
        this.cQid = cQid;
    }

    public Byte getcUid() {
        return cUid;
    }

    public void setcUid(Byte cUid) {
        this.cUid = cUid;
    }

    public String getcQTitle() {
        return cQTitle;
    }

    public void setcQTitle(String cQTitle) {
        this.cQTitle = cQTitle == null ? null : cQTitle.trim();
    }

    public Byte getcClose() {
        return cClose;
    }

    public void setcClose(Byte cClose) {
        this.cClose = cClose;
    }

    public Date getcCreateTime() {
        return cCreateTime;
    }

    public void setcCreateTime(Date cCreateTime) {
        this.cCreateTime = cCreateTime;
    }

    public String getcQContext() {
        return cQContext;
    }

    public void setcQContext(String cQContext) {
        this.cQContext = cQContext == null ? null : cQContext.trim();
    }

    public Byte getcGX() {
        return cGX;
    }

    public void setcGX(Byte cGX) {
        this.cGX = cGX;
    }

    public Integer getcHot() {
        return cHot;
    }

    public void setcHot(Integer cHot) {
        this.cHot = cHot;
    }
}