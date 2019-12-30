package grp.faq.controller

import com.alibaba.fastjson.JSONObject
import grp.faq.service.PraiseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, ResponseBody}


@Controller
@RequestMapping(value = Array("/praise"))
class PraiseController {
  @Autowired
  val praiseService: PraiseService = null
  @RequestMapping(value = Array("/praise"), method = Array(RequestMethod.POST))
  @ResponseBody
  def praise(praiseType: Int, id: Long, uid: Long): String = {
    val json = new JSONObject()
    if(praiseService.praise(praiseType, id, uid)) json.put("ERROR", 0) else json.put("ERROR", 1)
    json.toJSONString
  }
}
