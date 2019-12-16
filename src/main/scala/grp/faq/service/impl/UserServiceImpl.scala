package grp.faq.service.impl

import java.util
import java.util.Date

import gqp.faq.utils.MD5Utils
import grp.faq.dao.UserMapper
import grp.faq.entity.User
import grp.faq.service.UserService
import grp.faq.utils.LogHelper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.List

import org.springframework.transaction.annotation.Transactional

@Service
class UserServiceImpl() extends UserService with LogHelper {

  @Autowired
  val userDao: UserMapper = null

  override def login(username: String, password: String): User = {
    try{
      val user = userDao.login(username, MD5Utils.getMd5(password))
      if (user != null){
        userDao.updateLastLogin(new Date(), user.cUid)
      }
      user
    }
    catch {
      case e: Exception => {
        logger.error(e.toString)
        e.printStackTrace()
        null
      }
    }
  }
  override def register(user: User): Boolean = {
    if(user.cAdmin == null) {
      user.cAdmin = 1.asInstanceOf[Byte]
    }
    user.cIsDelete = 0.asInstanceOf[Byte]
    user.cPassword = MD5Utils.getMd5(user.cPassword)
    try{
      userDao.insert(user)
      true
    }catch {
      case e: Exception =>{
        logger.error(e.toString)
        false
      }
    }
  }

  override def delete(user: User): Boolean = {
    if(user.cUid == null) return false
    try{
      user.cIsDelete = 1.asInstanceOf[Byte]
      userDao.delete(user)
      true
    }
    catch {
      case e: Exception => {
        logger.error(e.toString)
        false
      }
    }
  }

  override def getAllUsers(): List[User] = {
    var users: List[User] = null
    try{
      users = userDao.getAllUsers()
    }
    catch {
      case e: Exception =>
        null
    }
    users
  }



  override def getUserRank(): util.List[User] = {
    var users: util.List[User] = null
    try{
      users = userDao.getUserRank()
      users
    }catch {
      case e: Exception =>
        null
    }
  }

  override def findUseranme(username: String): Boolean = {
    if(userDao.findUsername(username) != null){
      false
    }
    else{
      true
    }
  }

  override def autoLogin(username: String, password: String): User = {
    try{
      val user = userDao.login(username, password)
      if (user != null){
        userDao.updateLastLogin(new Date(), user.cUid)
      }
      user
    }
    catch {
      case e: Exception => {
        logger.error(e.toString)
        e.printStackTrace()
        null
      }
    }
  }
}
