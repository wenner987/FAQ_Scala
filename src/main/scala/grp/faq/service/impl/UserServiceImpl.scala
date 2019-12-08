package grp.faq.service.impl

import grp.faq.dao.UserMapper
import grp.faq.entity.User
import grp.faq.service.UserService
import grp.faq.utils.LogHelper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl() extends UserService with LogHelper {

  @Autowired
  val userDao: UserMapper = null

  override def login(username: String, password: String): User = {
    try{
      userDao.login(username, password)
    }
    catch {
      case e: Exception => {
        logger.error(e.toString)
        null
      }
    }
  }

  override def register(user: User): Boolean = {
    if(user.cAdmin == null) {
      user.cAdmin = new Integer((1))
    }
    user.cIsDelete = new Integer(0)
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
      user.cIsDelete = 1
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
}
