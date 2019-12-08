package grp.faq.controller

import grp.faq.utils.LogHelper
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping}

@Controller
class Page extends LogHelper {
  @RequestMapping(value = Array("/login"))
  def login: String = "login"
  @RequestMapping(value = Array("/index"))
  def index: String = "index"
}
