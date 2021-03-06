package grp.faq.interceptor

import grp.faq.utils.LogHelper
import javax.servlet.http.{HttpServletRequest, HttpServletResponse}
import org.apache.log4j.Logger
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.HandlerInterceptor
import org.springframework.web.servlet.ModelAndView

class LoginInterceptor extends HandlerInterceptor with LogHelper{

  @throws[Exception]
  override def preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean = {
    response.setCharacterEncoding("UTF-8")
    logger.info(request.getRequestURI)
    true
//    if(request.getRequestURI.indexOf("delete") != -1 && request.getSession().getAttribute("admin") == 1){
//      true
//    }
//    else{
//      false
//    }
  }

  @throws[Exception]
  override def postHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any, modelAndView: ModelAndView): Unit = {
  }

  @throws[Exception]
  override def afterCompletion(request: HttpServletRequest, response: HttpServletResponse, handler: Any, ex: Exception): Unit = {
    if(request.getRequestURL.indexOf("login") != -1){
      val isAdmin = request.getAttribute("body")
      println(isAdmin)
    }
  }
}
