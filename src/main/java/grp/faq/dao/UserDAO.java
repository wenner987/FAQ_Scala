package grp.faq.dao;

import grp.faq.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

public interface UserDAO {

    UserEntity selectByName(@Param("userName") String userName);

    int insertUser(UserEntity user);
}
