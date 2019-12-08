package grp.faq.controller

import com.alibaba.fastjson.JSONObject
import com.oracle.tools.packager.Log.Logger
import grp.faq.entity.User
import grp.faq.service.UserService
import grp.faq.utils.LogHelper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.apache.log4j.Logger


@Controller
@RequestMapping(value = Array("/user"))
class UserController() extends LogHelper{

  @Autowired
  val userService: UserService = null

  @RequestMapping(value = Array("/login"))
  @ResponseBody
  private[controller] def login(username: String, password: String) = {
    val json: JSONObject = new JSONObject
    val user: User = userService.login(username, password)
    logger.info("username" + username)
    logger.info("password" + password)

    if(user == null)
      json.put("ERR", 1)
    else{
      json.put("ERROR", new Integer(1))
      json.put("USER_INFO", user)
    }
    json.toJSONString
  }

  @RequestMapping(value = Array("/register"))
  @ResponseBody
  private[controller] def register(user: User) = {
    val json = new JSONObject
    userService.register(user)
    json.toJSONString
  }

}