package grp.faq.service

import grp.faq.entity.Answer
import java.util.Map

trait AnswerService {
  def update(answer: Answer): Boolean

  def delete(ansid: Int): Boolean

  def addAnswer(answer: Answer): Boolean

  def getAnswer(qid: Int): Map[Object,Object]

  def getTodayAnswer(): Long
}
