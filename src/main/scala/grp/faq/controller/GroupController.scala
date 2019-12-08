package grp.faq.controller

import com.alibaba.fastjson.JSONObject
import grp.faq.entity.Group
import grp.faq.service.GroupService
import grp.faq.utils.LogHelper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, ResponseBody}

@Controller
@RequestMapping(value = Array("/group"))
class GroupController extends LogHelper{

  @Autowired
  val groupService: GroupService = null

  @RequestMapping(value = Array("/add"), method = Array(RequestMethod.POST))
  @ResponseBody
  def addGroup(group: Group): String = {
    val json: JSONObject = new JSONObject()
    json.put("ERROR", groupService.add(group))
    json.toJSONString
  }


}
