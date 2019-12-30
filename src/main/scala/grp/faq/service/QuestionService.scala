package grp.faq.service

import java.util.List
import java.util.Map

import com.alibaba.fastjson.JSONObject
import grp.faq.entity.Question

trait QuestionService {
  def getQuestionByUsername(username: String, index: Int): List[Question]

  def getQuestionNumber(): Int

  def getQuestion(question: Question): Map[Object,Object]

  def addQuestion(question: Question): Boolean

  def getQuestionRank(index: Int): List[Question]


  def getTodayQuestion(): Long

}
