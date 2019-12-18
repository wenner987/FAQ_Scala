package grp.faq.dao

import grp.faq.entity.Group
import java.util.List

import org.apache.ibatis.annotations.Param

trait GroupMapper {
  def selectGroupById(@Param("gid")gid: Int): Group = ???

  def getAllGroup(): List[Group]

  def add(group: Group): Boolean
}
