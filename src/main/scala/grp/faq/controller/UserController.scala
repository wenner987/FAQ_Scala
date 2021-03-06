package grp.faq.controller

import com.alibaba.fastjson.JSONObject
import grp.faq.entity.User
import grp.faq.service.UserService
import grp.faq.utils.LogHelper
import javax.servlet.http.{Cookie, HttpServletRequest, HttpServletResponse}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, ResponseBody}
import java.util.List

import gqp.faq.utils.MD5Utils
import org.springframework.transaction.annotation.Transactional

@Controller
@RequestMapping(value = Array("/user"))
class UserController() extends LogHelper{

  @Autowired
  val userService: UserService = null

  @RequestMapping(value = Array("/login"), method = Array(RequestMethod.POST))
  @ResponseBody
  private[controller] def login(username: String, password: String, autoLogin: Int, request: HttpServletRequest, response: HttpServletResponse) = {
    val json: JSONObject = new JSONObject
    var user: User = null
    if(autoLogin == 0){
      user = userService.login(username, password)
    }
    else{
      user = userService.autoLogin(username, password)
    }
    logger.info("username" + username)
    logger.info("password" + password)
    if(user == null)
      json.put("ERR", new Integer(1))
    else{
      json.put("ERROR", new Integer(0))
      json.put("USER_INFO", user)

      if(user.cAdmin == 1){
        request.getSession().setAttribute("admin", 1)
      }

      val username_cookie: Cookie = new Cookie("username", username)
      val password_cookie: Cookie = new Cookie("password", MD5Utils.getMd5(password))
      response.addCookie(password_cookie)
      response.addCookie(username_cookie)
    }
    json.toJSONString
  }

  @RequestMapping(value = Array("/register"), method = Array(RequestMethod.POST))
  @ResponseBody
  @Transactional
  private[controller] def register(user: User) = {
    val json = new JSONObject
    if(!userService.findUseranme(user.cUsername)){
      json.put("ERROR", 2)
    }
    else {
      json.put("ERROR", if(userService.register(user)) 0 else 1)
    }
    json.toJSONString
  }

  @RequestMapping(value = Array("/delete"), method = Array(RequestMethod.POST))
  @ResponseBody
  private[controller] def delete(user: User): String ={
    val json = new JSONObject()
    json.put("ERROR", if(userService.delete(user)) 0 else 1)
    json.toJSONString
  }

  @RequestMapping(value = Array("/getAllUser"))
  @ResponseBody
  private[controller] def getUser(index: Int): String ={
    val json = new JSONObject()
    val users: List[User] = userService.getAllUsers()
    if(users == null){
      json.put("ERROR", 1)
    }
    else{
      json.put("USERS", users)
      json.put("ERROR", 0)
    }
    json.toJSONString
  }

  @RequestMapping(value = Array("/getUserRank"))
  @ResponseBody
  private[controller] def getUser(): String ={
    val json = new JSONObject()
    val userList: java.util.List[User] = userService.getUserRank()
    if(userList != null){
      json.put("ERROR", 0)
      json.put("USERS", userList)
    }
    else{
      json.put("ERROR", 1)
    }
    json.toJSONString
  }

  @ResponseBody
  @RequestMapping(value = Array("/finduserbyname"), method = Array(RequestMethod.POST))
  def findUserByName(username:String) : String ={
    val json = new JSONObject()

    val user = userService.findUserByName(username);
    if(user != null){
      json.put("ERROR", 0)
      json.put("USER", user)
    }
    else{
      json.put("ERROR", 1)
    }
    json.toJSONString
  }

  @RequestMapping(value = Array("getUserById"), method = Array(RequestMethod.POST))
  @ResponseBody
  def getUserById(uid: Int): String = {
    val json = new JSONObject()
    val user: User = userService.getUserById(uid)
    if(user != null){
      json.put("ERROR", 0)
      json.put("USER", user)
    }
    else{
      json.put("ERROR", 1)
    }
    json.toJSONString
  }
}
