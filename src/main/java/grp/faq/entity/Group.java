package grp.faq.entity;

public class Group {
    private Long cGid;

    private String cDesc;

    private Byte cIsDelete;

    private String cGroupName;

    public Group(Long cGid, String cDesc, Byte cIsDelete, String cGroupName) {
        this.cGid = cGid;
        this.cDesc = cDesc;
        this.cIsDelete = cIsDelete;
        this.cGroupName = cGroupName;
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
}