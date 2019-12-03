package grp.faq.dao;

import grp.faq.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Byte cUid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Byte cUid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}