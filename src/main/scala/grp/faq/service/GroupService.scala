package grp.faq.service

import grp.faq.entity.Group
import java.util.List

trait GroupService {
  def getGroupById(gid: Int): Group

  def getAllGroups(): List[Group]

  def add(group: Group): Boolean

}
