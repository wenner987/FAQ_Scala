package grp.faq.service

import java.util

import grp.faq.entity.User

trait UserService {
  def getUserById(uid: Int): User

  def findUserByName(username: String): User

  def autoLogin(username: String, password: String): User

  def findUseranme(username: String): Boolean

  def getUserRank(): util.List[User]

  def getAllUsers(): util.List[User]

  def delete(user: User): Boolean

  def register(user: User): Boolean

  def login(username: String, password: String): User

}