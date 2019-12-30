package grp.faq.service

import grp.faq.entity.Answer
import java.util.Map
import java.util.List

trait AnswerService {
  def getAnswerByUsername(username: String, index: Int): List[Map[String, String]]

  def update(answer: Answer): Boolean

  def delete(ansid: Int): Boolean

  def addAnswer(answer: Answer): Boolean

  def getAnswer(qid: Int, uid: Int): List[Map[Object,Object]]

  def getTodayAnswer(): Long
}
