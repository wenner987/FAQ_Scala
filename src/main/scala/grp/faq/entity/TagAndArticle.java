package grp.faq.entity;

public class TagAndArticle {
    public Integer cId;

    public Integer cArtId;

    public Integer cTagId;

    public TagAndArticle(Integer cId, Integer cArtId, Integer cTagId) {
        this.cId = cId;
        this.cArtId = cArtId;
        this.cTagId = cTagId;
    }

    public TagAndArticle() {
        super();
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getcArtId() {
        return cArtId;
    }

    public void setcArtId(Integer cArtId) {
        this.cArtId = cArtId;
    }

    public Integer getcTagId() {
        return cTagId;
    }

    public void setcTagId(Integer cTagId) {
        this.cTagId = cTagId;
    }
}