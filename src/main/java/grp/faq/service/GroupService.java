package grp.faq.service;

import grp.faq.entity.GroupEntity;

import java.util.List;

public interface GroupService {

    Boolean insertGroup(String name, String desc);

    Boolean deleteGroup(String name);

    GroupEntity selectByName(String name);

    List<GroupEntity> selectAll();
}
