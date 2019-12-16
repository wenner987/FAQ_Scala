package grp.faq.service

import java.util

import grp.faq.entity.User

trait UserService {
  def autoLogin(username: String, password: String): User

  def findUseranme(username: String): Boolean

  def getUserRank(): util.List[User]

  def getAllUsers(): util.List[User]

  def delete(user: User): Boolean

  def register(user: User): Boolean

  def login(username: String, password: String): User

}