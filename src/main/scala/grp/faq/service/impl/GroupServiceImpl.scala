package grp.faq.service.impl

import grp.faq.dao.GroupMapper
import grp.faq.entity.Group
import grp.faq.service.GroupService
import grp.faq.utils.LogHelper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.List

@Service
class GroupServiceImpl extends GroupService with LogHelper {
  @Autowired
  val groupDao: GroupMapper = null

  override def add(group: Group): Boolean = {
    try{
      groupDao.add(group)
    }
    catch {
      case e: Exception => {
        logger.error(e.toString)
        false
      }
    }
  }

  override def getAllGroups(): List[Group] = {
    groupDao.getAllGroup()
  }

}
