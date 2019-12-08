package grp.faq.service.impl

import grp.faq.dao.UserMapper
import grp.faq.entity.User
import grp.faq.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl() extends UserService {

  @Autowired
  val userDao: UserMapper = null

  override def login(username: String, password: String): User = {
    userDao.login(username, password)
  }

  override def register(user: User): Boolean = {
    if(user.cAdmin == null) {
      user.cAdmin = 0
    }
    user.cIsDelete = 0
    try{
      userDao.insert(user)
      true
    }catch {
      case e: Exception =>
        false
    }
  }
}
