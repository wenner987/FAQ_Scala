package grp.faq.service

import grp.faq.entity.User

trait UserService {
  def register(user: User): Boolean

  def login(username: String, password: String): User

}