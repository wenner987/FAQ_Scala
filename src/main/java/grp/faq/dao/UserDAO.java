package grp.faq.dao;

import grp.faq.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDAO {

    UserEntity selectByName(@Param("userName") String userName);

    int insertUser(UserEntity user);

    int delete(@Param("id")Integer id);

    int update(UserEntity user);

    List selectAll();

    List selectPagination(@Param("index")Integer index);
}
