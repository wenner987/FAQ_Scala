package grp.faq.dao;

import grp.faq.entity.GroupEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GroupDAO {

    int insertGroup(GroupEntity groupEntity);

    List selectAll();

    GroupEntity selectByName(@Param("name")String name);

    int deleteByName(@Param("name")String name);

    List selectPagination(@Param("index") Integer index);

    int update(@Param("name")String name, @Param("desc")String desc);

}
