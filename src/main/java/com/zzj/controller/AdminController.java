package com.zzj.controller;

import com.zzj.pojo.Admin;
import com.zzj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/admin")
public class AdminController {
//调用service
    //注入BookService
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;
    @RequestMapping("/login")
    public String queryAdmin(HttpSession session, String username, String password, Model model){
        //把用户的信息保存在session中
        session.setAttribute("userLogin", username);
        //将session发送到首页
        model.addAttribute("username",username);
        Admin admin = bookService.queryAdmin(username,password);
        if (admin != null ){
             return "redirect:/book/allBook";//重定向
        }
            return "redirect:/index.jsp";
    }
    //注销session
    @RequestMapping("/goOut")
    public String goOut(HttpSession session, String username, String password, Model model) {

        //session.setAttribute("userLogin", username);
        //model.addAttribute("username",username);
        session.removeAttribute("userLogin");
        return "redirect:/login.jsp";
    }
}
