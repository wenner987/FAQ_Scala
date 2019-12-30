package grp.faq.controller

import com.alibaba.fastjson.JSONObject
import grp.faq.service.QuestionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, ResponseBody}
import java.util.List

import grp.faq.entity.Question
import grp.faq.utils.LogHelper

@Controller
@RequestMapping(value = Array("/question"))
class QuestionController extends LogHelper{
  @Autowired
  val questionService: QuestionService = null

  @RequestMapping(value = Array("/getTodayQuestion"), method = Array(RequestMethod.POST))
  @ResponseBody
  def getTodayQuestion(): String ={
    val json = new JSONObject()
    json.put("COUNT", questionService.getTodayQuestion())
    json.put("ERROR", 0)
    json.toJSONString
  }

  @RequestMapping(value = Array("/getQuestionRank"), method = Array(RequestMethod.POST))
  @ResponseBody
  def getQuestionRank(index: Int): String ={
    logger.info(index)
    val json = new JSONObject()
    val questions: List[Question] = questionService.getQuestionRank(index)
    if(questions != null){
      json.put("QUESTIONS", questions)
      json.put("ERROR", 0)
    }
    else{
      json.put("ERROR", 1)
    }
    json.toJSONString
  }
  @RequestMapping(value =  Array("/getQuestionNumber"), method = Array(RequestMethod.POST))
  @ResponseBody
  def geQuestionNumber(): String = {
    val json = new JSONObject()
    json.put("NUMBER", questionService.getQuestionNumber())
    json.put("ERROR", 0)
    json.toJSONString
  }
  @RequestMapping(value = Array("/addQuestion"), method = Array(RequestMethod.POST))
  @ResponseBody
  def addQuestion(question: Question): String ={
    val json = new JSONObject()
    json.put("ERROR", if(questionService.addQuestion(question)) 0 else 1)
    json.toJSONString
  }
  @RequestMapping(value = Array("/getQuestion"), method = Array(RequestMethod.POST))
  @ResponseBody
  def getQuestion(question: Question): String ={
    val json = new JSONObject()
    val questions = questionService.getQuestion(question)
    if(questions == null){
      json.put("ERROR", 1)
    }
    else{
      json.put("ERROR", 0)
      json.put("QUESTION", questions)
    }
    json.toJSONString
  }

  @RequestMapping(value = Array("getQuestionByUsername"), method = Array(RequestMethod.POST))
  @ResponseBody
  def getQuestionByUsername(username: String, index: Int): String = {
    val json = new JSONObject()
    val questions = questionService.getQuestionByUsername(username, index * 10)
    if(questions == null){
      json.put("ERROR", 1)
    }
    else{
      json.put("QUESTIONS", questions)
      json.put("ERROR", 0)
    }
    json.toJSONString
  }
}
