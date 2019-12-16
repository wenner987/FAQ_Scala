package grp.faq.dao

import grp.faq.entity.Group
import java.util.List

trait GroupMapper {
  def getAllGroup(): List[Group]

  def add(group: Group): Boolean
}
