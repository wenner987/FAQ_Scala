package grp.faq.dao;

import grp.faq.entity.GroupEntity;
import org.springframework.stereotype.Repository;


@Repository
public interface GroupDAO {

    int insertGroup(GroupEntity groupEntity);

}
