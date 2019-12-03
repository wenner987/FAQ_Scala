package grp.faq.dao;

import grp.faq.entity.Group;

public interface GroupMapper {
    int deleteByPrimaryKey(Long cGid);

    int insert(Group record);

    int insertSelective(Group record);

    Group selectByPrimaryKey(Long cGid);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKey(Group record);
}