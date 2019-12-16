package grp.faq.entity;

import java.util.Date;

public class Comment {
    public Long cComid;

    public Byte cUid;

    public String cContext;

    public Date cCreateTime;

    public Byte cIsDelete;

    public Byte cComType;

    public Long cCommonId;

    public Comment(Long cComid, Byte cUid, String cContext, Date cCreateTime, Byte cIsDelete, Byte cComType, Long cCommonId) {
        this.cComid = cComid;
        this.cUid = cUid;
        this.cContext = cContext;
        this.cCreateTime = cCreateTime;
        this.cIsDelete = cIsDelete;
        this.cComType = cComType;
        this.cCommonId = cCommonId;
    }

    public Comment() {
        super();
    }

    public Long getcComid() {
        return cComid;
    }

    public void setcComid(Long cComid) {
        this.cComid = cComid;
    }

    public Byte getcUid() {
        return cUid;
    }

    public void setcUid(Byte cUid) {
        this.cUid = cUid;
    }

    public String getcContext() {
        return cContext;
    }

    public void setcContext(String cContext) {
        this.cContext = cContext == null ? null : cContext.trim();
    }

    public Date getcCreateTime() {
        return cCreateTime;
    }

    public void setcCreateTime(Date cCreateTime) {
        this.cCreateTime = cCreateTime;
    }

    public Byte getcIsDelete() {
        return cIsDelete;
    }

    public void setcIsDelete(Byte cIsDelete) {
        this.cIsDelete = cIsDelete;
    }

    public Byte getcComType() {
        return cComType;
    }

    public void setcComType(Byte cComType) {
        this.cComType = cComType;
    }

    public Long getcCommonId() {
        return cCommonId;
    }

    public void setcCommonId(Long cCommonId) {
        this.cCommonId = cCommonId;
    }
}