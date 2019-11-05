package grp.faq.interceptor;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

    Logger logger = Logger.getLogger(LoginInterceptor.class);

    public boolean preHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler) throws Exception {
        logger.info(request.getRequestURI());
        return true;
//        StringBuffer url = request.getRequestURL();
//        if (url.indexOf("login") != -1) {
//            request.setCharacterEncoding("UTF-8");
//            return true;
//        } else {
//            response.sendRedirect(request.getContextPath() + "/login_tip.html");
//            return false;
//        }
    }

    public void postHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
