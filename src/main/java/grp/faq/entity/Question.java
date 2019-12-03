package grp.faq.entity;

import java.util.Date;

public class Question {
    private Long cQid;

    private Byte cUid;

    private String cQTitle;

    private Byte cClose;

    private Date cCreateTime;

    private String cQContext;

    private Byte cGX;

    public Question(Long cQid, Byte cUid, String cQTitle, Byte cClose, Date cCreateTime, String cQContext, Byte cGX) {
        this.cQid = cQid;
        this.cUid = cUid;
        this.cQTitle = cQTitle;
        this.cClose = cClose;
        this.cCreateTime = cCreateTime;
        this.cQContext = cQContext;
        this.cGX = cGX;
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
}