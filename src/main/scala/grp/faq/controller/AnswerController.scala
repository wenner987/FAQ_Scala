package grp.faq.controller

import com.alibaba.fastjson.JSONObject
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
}
