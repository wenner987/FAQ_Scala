package grp.faq.entity;

public class Message {
    private Integer cMessageId;

    private String cMessageSource;

    private Integer cMessageType;

    private Integer cReaded;

    public Message(Integer cMessageId, String cMessageSource, Integer cMessageType, Integer cReaded) {
        this.cMessageId = cMessageId;
        this.cMessageSource = cMessageSource;
        this.cMessageType = cMessageType;
        this.cReaded = cReaded;
    }

    public Message() {
        super();
    }

    public Integer getcMessageId() {
        return cMessageId;
    }

    public void setcMessageId(Integer cMessageId) {
        this.cMessageId = cMessageId;
    }

    public String getcMessageSource() {
        return cMessageSource;
    }

    public void setcMessageSource(String cMessageSource) {
        this.cMessageSource = cMessageSource == null ? null : cMessageSource.trim();
    }

    public Integer getcMessageType() {
        return cMessageType;
    }

    public void setcMessageType(Integer cMessageType) {
        this.cMessageType = cMessageType;
    }

    public Integer getcReaded() {
        return cReaded;
    }

    public void setcReaded(Integer cReaded) {
        this.cReaded = cReaded;
    }
}