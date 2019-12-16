package grp.faq.controller

import com.alibaba.fastjson.JSONObject
import grp.faq.entity.Answer
import grp.faq.service.AnswerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, ResponseBody}

@Controller
@RequestMapping(value = Array("/answer"))
class AnswerController {
  @Autowired
  val answerService: AnswerService = null
  @RequestMapping(value = Array("/getTodayAnswer"), method = Array(RequestMethod.POST))
  @ResponseBody
  def getTodayAnswer(): String ={
    val json = new JSONObject()
    json.put("COUNT", answerService.getTodayAnswer())
    json.put("ERROR", 0)
    json.toJSONString
  }
  @RequestMapping(value = Array("/getAnswer"), method = Array(RequestMethod.POST))
  @ResponseBody
  def getAnswer(qid: Int): String = {
    val json = new JSONObject()
    val answer = answerService.getAnswer(qid)
    if(answer == null){
      json.put("ERROR", 1)
    }
    else{
      json.put("ERROR", 0)
      json.put("ANSWERS", answer)
    }
    json.toJSONString
  }
  @RequestMapping(value = Array("/addAnswer"), method = Array(RequestMethod.POST))
  @ResponseBody
  def addAnswer(answer: Answer): String = {
    val json = new JSONObject()
    json.put("ERROR", if(answerService.addAnswer(answer)) 0 else 1)
    json.toJSONString
  }
  @RequestMapping(value = Array("/delete"), method = Array(RequestMethod.POST))
  @ResponseBody
  def delete(ansid: Int): String = {
    val json = new JSONObject()
    json.put("ERROR", if(answerService.delete(ansid)) 0 else 1)
    json.toJSONString
  }
  @RequestMapping(value = Array("/update"), method = Array(RequestMethod.POST))
  @ResponseBody
  def update(answer: Answer): String = {
    val json = new JSONObject()
    json.put("ERROR", if(answerService.update(answer)) 0 else 1)
    json.toJSONString
  }
}
