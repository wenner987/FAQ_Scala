package grp.faq.controller

import grp.faq.utils.LogHelper
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod}

@Controller
class Page extends LogHelper {
  @RequestMapping(value = Array("/login"), method = Array(RequestMethod.GET))
  def login: String = "login"
  @RequestMapping(value = Array("/index"), method = Array(RequestMethod.GET))
  def index: String = "index"
  @RequestMapping(value = Array("/register"), method = Array(RequestMethod.GET))
  def register: String = "register"
}
