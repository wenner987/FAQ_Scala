package grp.faq.service.impl;

import grp.faq.dao.GroupDAO;
import grp.faq.entity.GroupEntity;
import grp.faq.service.GroupService;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupDAO groupDAO;

    Logger logger = Logger.getLogger(GroupServiceImpl.class);

    public void insertGroup(String name, String desc) throws Exception {
        GroupEntity group = groupDAO.selectByName(name);
        if(group != null){
            throw new Exception("Group name already exists.");
        }
        GroupEntity newGroup = new GroupEntity();
        newGroup.setGroupName(name);
        newGroup.setgDesc(desc);
        newGroup.setIsDelete((short) 0);
        groupDAO.insertGroup(newGroup);
    }

    public Boolean deleteGroup(String name) {
        int r = groupDAO.deleteByName(name);
        return r != 0;
    }

    public GroupEntity selectByName(String name) {
        GroupEntity ret = groupDAO.selectByName(name);
        logger.info(ret);
        return ret;
    }

    public List<GroupEntity> selectAll() {
        return groupDAO.selectAll();
    }

    public List<GroupEntity> selectPagination(Integer index){
        logger.info(index);
        List list = groupDAO.selectPagination(index);
        logger.info(list);
        return list;
    }

    public void update(String name, String desc) throws Exception {
        logger.info("name=" + name);
        logger.info("desc=" + desc);
        int r = groupDAO.update(name, desc);
        logger.info("r=" + r);
        if(r == 0){
            throw new Exception("Reason unknown.");
        }
    }
}
