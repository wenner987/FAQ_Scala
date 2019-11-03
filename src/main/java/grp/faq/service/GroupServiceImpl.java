package grp.faq.service;

import grp.faq.dao.GroupDAO;
import grp.faq.entity.GroupEntity;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupDAO groupDAO;

    public Boolean insert(String desc) {

        GroupEntity t = new GroupEntity();
        t.setcDesc(desc);
        t.setIsDelete((short) 0);
        groupDAO.insertGroup(t);
        return null;
    }
}
