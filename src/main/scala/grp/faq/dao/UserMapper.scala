package grp.faq.dao

import grp.faq.entity.User
import org.apache.ibatis.annotations.Param

trait UserMapper {
  def insert(user: User): Unit

  def login(@Param("username")username: String, @Param("password")password: String): User

  def delete(@Param("user")user: User)

}
