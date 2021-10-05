package com.zzj.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取session
        HttpSession session = request.getSession();
        //登录页面放行
        if (request.getRequestURI().contains("index.jsp")) {
            return true;
        }

        //放行：登录后放行
        else if (session.getAttribute("userLogin") != null) {
            return true;
        } else {
            request.getRequestDispatcher("index.jsp").forward(request, response);
            return false;
        }
    }
}
