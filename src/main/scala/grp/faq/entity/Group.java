package grp.faq.entity;

public class Group {
    public Long cGid;

    public String cDesc;

    public Byte cIsDelete;

    public String cGroupName;

    public String cAddAllow;

    public Group(Long cGid, String cDesc, Byte cIsDelete, String cGroupName, String cAddAllow) {
        this.cGid = cGid;
        this.cDesc = cDesc;
        this.cIsDelete = cIsDelete;
        this.cGroupName = cGroupName;
        this.cAddAllow = cAddAllow;
    }

    public Group() {
        super();
    }

    public Long getcGid() {
        return cGid;
    }

    public void setcGid(Long cGid) {
        this.cGid = cGid;
    }

    public String getcDesc() {
        return cDesc;
    }

    public void setcDesc(String cDesc) {
        this.cDesc = cDesc == null ? null : cDesc.trim();
    }

    public Byte getcIsDelete() {
        return cIsDelete;
    }

    public void setcIsDelete(Byte cIsDelete) {
        this.cIsDelete = cIsDelete;
    }

    public String getcGroupName() {
        return cGroupName;
    }

    public void setcGroupName(String cGroupName) {
        this.cGroupName = cGroupName == null ? null : cGroupName.trim();
    }

    public String getcAddAllow() {
        return cAddAllow;
    }

    public void setcAddAllow(String cAddAllow) {
        this.cAddAllow = cAddAllow == null ? null : cAddAllow.trim();
    }
}