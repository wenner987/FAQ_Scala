package grp.faq.entity;

import java.util.Date;

public class Answer {
    public Long cAnsid;

    public Byte cUid;

    public Long cQid;

    public Date cAnsTime;

    public String cAnsContext;

    public Byte cIsDelete;

    public Date cLastUpdate;

    public Byte cIsFold;

    public Answer(Long cAnsid, Byte cUid, Long cQid, Date cAnsTime, String cAnsContext, Byte cIsDelete, Date cLastUpdate, Byte cIsFold) {
        this.cAnsid = cAnsid;
        this.cUid = cUid;
        this.cQid = cQid;
        this.cAnsTime = cAnsTime;
        this.cAnsContext = cAnsContext;
        this.cIsDelete = cIsDelete;
        this.cLastUpdate = cLastUpdate;
        this.cIsFold = cIsFold;
    }

    public Answer() {
        super();
    }

    public Long getcAnsid() {
        return cAnsid;
    }

    public void setcAnsid(Long cAnsid) {
        this.cAnsid = cAnsid;
    }

    public Byte getcUid() {
        return cUid;
    }

    public void setcUid(Byte cUid) {
        this.cUid = cUid;
    }

    public Long getcQid() {
        return cQid;
    }

    public void setcQid(Long cQid) {
        this.cQid = cQid;
    }

    public Date getcAnsTime() {
        return cAnsTime;
    }

    public void setcAnsTime(Date cAnsTime) {
        this.cAnsTime = cAnsTime;
    }

    public String getcAnsContext() {
        return cAnsContext;
    }

    public void setcAnsContext(String cAnsContext) {
        this.cAnsContext = cAnsContext == null ? null : cAnsContext.trim();
    }

    public Byte getcIsDelete() {
        return cIsDelete;
    }

    public void setcIsDelete(Byte cIsDelete) {
        this.cIsDelete = cIsDelete;
    }

    public Date getcLastUpdate() {
        return cLastUpdate;
    }

    public void setcLastUpdate(Date cLastUpdate) {
        this.cLastUpdate = cLastUpdate;
    }

    public Byte getcIsFold() {
        return cIsFold;
    }

    public void setcIsFold(Byte cIsFold) {
        this.cIsFold = cIsFold;
    }
}