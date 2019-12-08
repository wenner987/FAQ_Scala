package grp.faq.dao

import grp.faq.entity.User
import org.apache.ibatis.annotations.Param

trait UserMapper {
  def deleteByPrimaryKey(cUid: Byte): Int

  def insert(record: User): Int

  def insertSelective(record: User): Int

  def selectByPrimaryKey(cUid: Byte): User

  def updateByPrimaryKeySelective(record: User): Int

  def updateByPrimaryKey(record: User): Int

  def login(@Param("username")username: String, @Param("password")password: String): User

}
