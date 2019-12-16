package grp.faq.entity;

public class Tag {
    public Integer cId;

    public String cTag;

    public Integer cCount;

    public Tag(Integer cId, String cTag, Integer cCount) {
        this.cId = cId;
        this.cTag = cTag;
        this.cCount = cCount;
    }

    public Tag() {
        super();
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcTag() {
        return cTag;
    }

    public void setcTag(String cTag) {
        this.cTag = cTag == null ? null : cTag.trim();
    }

    public Integer getcCount() {
        return cCount;
    }

    public void setcCount(Integer cCount) {
        this.cCount = cCount;
    }
}