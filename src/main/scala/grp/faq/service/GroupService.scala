package grp.faq.service

import grp.faq.entity.Group
import java.util.List

trait GroupService {
  def getAllGroups(): List[Group]

  def add(group: Group): Boolean

}
