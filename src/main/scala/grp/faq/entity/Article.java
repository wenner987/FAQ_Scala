package grp.faq.entity;

import java.util.Date;

public class Article {
    public Long cArtid;

    public Byte cUid;

    public Long cGid;

    public String cArtContext;

    public String cArtTitle;

    public Date cArtCtime;

    public Byte cIsDelete;

    public Date cLastUpdate;

    public Long cBrowseCount;

    public Byte cGX;

    public Article(Long cArtid, Byte cUid, Long cGid, String cArtContext, String cArtTitle, Date cArtCtime, Byte cIsDelete, Date cLastUpdate, Long cBrowseCount, Byte cGX) {
        this.cArtid = cArtid;
        this.cUid = cUid;
        this.cGid = cGid;
        this.cArtContext = cArtContext;
        this.cArtTitle = cArtTitle;
        this.cArtCtime = cArtCtime;
        this.cIsDelete = cIsDelete;
        this.cLastUpdate = cLastUpdate;
        this.cBrowseCount = cBrowseCount;
        this.cGX = cGX;
    }

    public Article() {
        super();
    }

    public Long getcArtid() {
        return cArtid;
    }

    public void setcArtid(Long cArtid) {
        this.cArtid = cArtid;
    }

    public Byte getcUid() {
        return cUid;
    }

    public void setcUid(Byte cUid) {
        this.cUid = cUid;
    }

    public Long getcGid() {
        return cGid;
    }

    public void setcGid(Long cGid) {
        this.cGid = cGid;
    }

    public String getcArtContext() {
        return cArtContext;
    }

    public void setcArtContext(String cArtContext) {
        this.cArtContext = cArtContext == null ? null : cArtContext.trim();
    }

    public String getcArtTitle() {
        return cArtTitle;
    }

    public void setcArtTitle(String cArtTitle) {
        this.cArtTitle = cArtTitle == null ? null : cArtTitle.trim();
    }

    public Date getcArtCtime() {
        return cArtCtime;
    }

    public void setcArtCtime(Date cArtCtime) {
        this.cArtCtime = cArtCtime;
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

    public Long getcBrowseCount() {
        return cBrowseCount;
    }

    public void setcBrowseCount(Long cBrowseCount) {
        this.cBrowseCount = cBrowseCount;
    }

    public Byte getcGX() {
        return cGX;
    }

    public void setcGX(Byte cGX) {
        this.cGX = cGX;
    }
}