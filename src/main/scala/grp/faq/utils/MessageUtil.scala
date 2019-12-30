package grp.faq.utils

import grp.faq.dao.{AnswerMapper, CommentMapper, UserMapper}
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class MessageUtil

object MessageUtil {
  @Autowired
  val userDao: UserMapper = null
  @Autowired
  val answerDao: AnswerMapper = null
  @Autowired
  val comment: CommentMapper = null

  def getMessage(uid: Long, _type: Int, __type: Int): String = {
    userDao.selectUserByid(uid.asInstanceOf[Int]).cUsername.+(
       (if(_type == 1) "点赞" else if(_type == 2) "回答" else if(_type==3) "评论").+("了您的").+(
        (if(__type==1) "文章" else if(__type==2) "问题" else if(__type==3) "评论").asInstanceOf[java.lang.String]))
   }
}
