package grp.faq.service;

import grp.faq.entity.GroupEntity;

import java.util.List;

public interface GroupService {

    void insertGroup(String name, String desc) throws Exception;

    Boolean deleteGroup(String name);

    GroupEntity selectByName(String name);

    List<GroupEntity> selectAll();

    List<GroupEntity> selectPagination(Integer index);

    void update(String name, String desc) throws Exception;
}
