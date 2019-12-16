package grp.faq.entity;

public class MessageAndUser {
    public Integer cId;

    public Integer cMessageId;

    public Integer cUserId;

    public MessageAndUser(Integer cId, Integer cMessageId, Integer cUserId) {
        this.cId = cId;
        this.cMessageId = cMessageId;
        this.cUserId = cUserId;
    }

    public MessageAndUser() {
        super();
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getcMessageId() {
        return cMessageId;
    }

    public void setcMessageId(Integer cMessageId) {
        this.cMessageId = cMessageId;
    }

    public Integer getcUserId() {
        return cUserId;
    }

    public void setcUserId(Integer cUserId) {
        this.cUserId = cUserId;
    }
}