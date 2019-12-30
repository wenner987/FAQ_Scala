package grp.faq.service.impl

import grp.faq.service.PraiseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import grp.faq.dao.{MessageMapper, PraiseMapper, UserMapper}
import grp.faq.entity.User
import grp.faq.utils.MessageUtil
import org.springframework.transaction.annotation.Transactional

@Service
class PraiseServiceImpl extends PraiseService{
  @Autowired
  val praiseDao: PraiseMapper = null
  @Autowired
  val messageDao: MessageMapper = null
  @Autowired
  val userDao: UserMapper = null

  @Transactional
  override def praise(praiseType: Int, id: Long, uid: Long): Boolean = {
    try{
      praiseDao.praise(praiseType, id, uid)
      val user = userDao.selectUserByid(uid.asInstanceOf[Int])
      messageDao.addMessage(uid, 1, MessageUtil.getMessage(uid, 1, if(praiseType==2) 1 else 2))
      true
    }
    catch{
      case exception: Exception =>
        false
    }
  }
}
