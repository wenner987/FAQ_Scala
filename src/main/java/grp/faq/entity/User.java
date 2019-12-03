package grp.faq.entity;

import java.util.Date;

public class User {
    private Byte cUid;

    private Long cGid;

    private Byte cAdmin;

    private String cUsername;

    private String cPassword;

    private Long cScore;

    private Date cLastLogin;

    private String cMailBox;

    private Byte cIsDelete;

    public User(Byte cUid, Long cGid, Byte cAdmin, String cUsername, String cPassword, Long cScore, Date cLastLogin, String cMailBox, Byte cIsDelete) {
        this.cUid = cUid;
        this.cGid = cGid;
        this.cAdmin = cAdmin;
        this.cUsername = cUsername;
        this.cPassword = cPassword;
        this.cScore = cScore;
        this.cLastLogin = cLastLogin;
        this.cMailBox = cMailBox;
        this.cIsDelete = cIsDelete;
    }

    public User() {
        super();
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

    public Byte getcAdmin() {
        return cAdmin;
    }

    public void setcAdmin(Byte cAdmin) {
        this.cAdmin = cAdmin;
    }

    public String getcUsername() {
        return cUsername;
    }

    public void setcUsername(String cUsername) {
        this.cUsername = cUsername == null ? null : cUsername.trim();
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword == null ? null : cPassword.trim();
    }

    public Long getcScore() {
        return cScore;
    }

    public void setcScore(Long cScore) {
        this.cScore = cScore;
    }

    public Date getcLastLogin() {
        return cLastLogin;
    }

    public void setcLastLogin(Date cLastLogin) {
        this.cLastLogin = cLastLogin;
    }

    public String getcMailBox() {
        return cMailBox;
    }

    public void setcMailBox(String cMailBox) {
        this.cMailBox = cMailBox == null ? null : cMailBox.trim();
    }

    public Byte getcIsDelete() {
        return cIsDelete;
    }

    public void setcIsDelete(Byte cIsDelete) {
        this.cIsDelete = cIsDelete;
    }
}