package grp.faq.entity;

public class GroupEntity {
    Long cGid = null;
    String cDesc = null;
    Short isDelete = null;

    @Override
    public String toString() {
        return "GroupEntity{" +
                "cGid=" + cGid +
                ", cDesc='" + cDesc + '\'' +
                ", isDelete=" + isDelete +
                '}';
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
        this.cDesc = cDesc;
    }

    public Short getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Short isDelete) {
        this.isDelete = isDelete;
    }
}
