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
    json.toJSONString
  }
}
