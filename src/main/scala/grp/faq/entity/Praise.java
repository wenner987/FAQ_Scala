package grp.faq.entity;

public class Praise {
    public Long cPraiseid;

    public Byte cUid;

    public Byte cPratype;

    public Long cCommonId;

    public Byte cIsDelete;

    public Praise(Long cPraiseid, Byte cUid, Byte cPratype, Long cCommonId, Byte cIsDelete) {
        this.cPraiseid = cPraiseid;
        this.cUid = cUid;
        this.cPratype = cPratype;
        this.cCommonId = cCommonId;
        this.cIsDelete = cIsDelete;
    }

    public Praise() {
        super();
    }

    public Long getcPraiseid() {
        return cPraiseid;
    }

    public void setcPraiseid(Long cPraiseid) {
        this.cPraiseid = cPraiseid;
    }

    public Byte getcUid() {
        return cUid;
    }

    public void setcUid(Byte cUid) {
        this.cUid = cUid;
    }

    public Byte getcPratype() {
        return cPratype;
    }

    public void setcPratype(Byte cPratype) {
        this.cPratype = cPratype;
    }

    public Long getcCommonId() {
        return cCommonId;
    }

    public void setcCommonId(Long cCommonId) {
        this.cCommonId = cCommonId;
    }

    public Byte getcIsDelete() {
        return cIsDelete;
    }

    public void setcIsDelete(Byte cIsDelete) {
        this.cIsDelete = cIsDelete;
    }
}