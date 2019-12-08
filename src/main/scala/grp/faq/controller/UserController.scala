package grp.faq.controller

import com.alibaba.fastjson.JSONObject
import grp.faq.entity.User
import grp.faq.service.UserService
import grp.faq.utils.LogHelper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, ResponseBody}


@Controller
@RequestMapping(value = Array("/user"))
class UserController() extends LogHelper{

  @Autowired
  val userService: UserService = null

  @RequestMapping(value = Array("/login"), method = Array(RequestMethod.POST))
  @ResponseBody
  private[controller] def login(username: String, password: String) = {
    val json: JSONObject = new JSONObject
    val user: User = userService.login(username, password)
    logger.info("username" + username)
    logger.info("password" + password)

    if(user == null)
      json.put("ERR", new Integer(1))
    else{
      json.put("ERROR", new Integer(0))
      json.put("USER_INFO", user)
    }
    json.toJSONString
  }

  @RequestMapping(value = Array("/register"), method = Array(RequestMethod.POST))
  @ResponseBody
  private[controller] def register(user: User) = {
    val json = new JSONObject
    json.put("ERROR", if(userService.register(user)) 0 else 1)
    json.toJSONString
  }
  @RequestMapping(value = Array("/delete"), method = Array(RequestMethod.POST))
  @ResponseBody
  private[controller] def delete(user: User): String ={
    val json = new JSONObject();
    json.put("ERROR", if(userService.delete(user)) 0 else 1)
    json.toJSONString
  }
}
