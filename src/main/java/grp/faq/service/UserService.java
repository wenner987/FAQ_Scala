package grp.faq.service;

public interface UserService {

    Boolean loginCheck(String name, String password);

    Boolean register(String name, String password);

    Boolean deleteUser(String id);

    Boolean changePassword(String id, String password, String oldPassword);
}
