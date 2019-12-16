package grp.faq.controller

import com.alibaba.fastjson.JSONObject
import grp.faq.service.MessageService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, ResponseBody}

@Controller
@RequestMapping(value = Array("/message"))
class MessageController {
  @Autowired
  val messageService: MessageService = null

  @RequestMapping(value = Array("/getMessage"), method = Array(RequestMethod.POST))
  @ResponseBody
  def getMessage(uid: Int): String ={
    val json = new JSONObject()
    val message = messageService.getMessage(uid)
    if(message != null){
      json.put("MESSAGES", message)
      json.put("ERROR", 0)
    }
    else{
      json.put("ERROR", 1)
    }
    json.toJSONString
  }

  @RequestMapping(value = Array("/readed"), method = Array(RequestMethod.POST))
  @ResponseBody
  def readed(messageId: Int): String = {
    val json = new JSONObject()
    json.put("ERROR", if(messageService.readed(messageId)) 0 else 1)
    json.toJSONString
  }
}
