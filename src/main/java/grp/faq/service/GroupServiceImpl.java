package grp.faq.service;

import grp.faq.dao.GroupDAO;
import grp.faq.entity.GroupEntity;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupDAO groupDAO;

    public Boolean insertGroup(String name, String desc) {
        GroupEntity newGroup = new GroupEntity();
        newGroup.setGroupName(name);
        newGroup.setDesc(desc);
        int ret = groupDAO.insertGroup(newGroup);
        return ret != 0;
    }

    public Boolean deleteGroup(String name) {
        int r = groupDAO.deleteByName(name);
        return r != 0;
    }

    public GroupEntity selectByName(String name) {
        return groupDAO.selectByName(name);
    }

    public List<GroupEntity> selectAll() {
        return groupDAO.selectAll();
    }
}
