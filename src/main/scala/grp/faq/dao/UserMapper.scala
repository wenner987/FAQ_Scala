package grp.faq.dao

import java.util
import java.util.Date

import grp.faq.entity.User
import org.apache.ibatis.annotations.Param

trait UserMapper {
  def selectUserByid(@Param("uid")uid: Int): User

  def findUserByName(username: String): User

  def findUsername(@Param("username")username: String): User

  def getUserRank(): util.List[User]

  def updateLastLogin(@Param("date") date: Date, @Param("C_UID") cUid: Byte): Unit

  def insert(user: User): Unit

  def login(@Param("username")username: String, @Param("password")password: String): User

  def delete(@Param("user")user: User)

  def getAllUsers(): util.List[User]


}
