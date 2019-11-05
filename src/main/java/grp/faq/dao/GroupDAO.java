package grp.faq.dao;

import grp.faq.entity.GroupEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GroupDAO {

    int insertGroup(GroupEntity groupEntity);

    List selectAll();

    GroupEntity selectByName(@Param("name")String name);

    int deleteByName(@Param("name")String name);

}
