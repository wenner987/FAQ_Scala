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
}
