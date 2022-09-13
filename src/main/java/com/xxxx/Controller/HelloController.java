package com.xxxx.Controller;

import com.xxxx.Service.UserService;
import com.xxxx.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
  // 注入userService
  @Autowired
  private UserService userService;
  @RequestMapping("hello")
  public ModelAndView hello(){
    ModelAndView mv = new ModelAndView();
    // 调用service 层查询方法
    User user = userService.queryUserByUserId(1);
    mv.addObject("user", user);
    System.out.println(user.getUserName());
    mv.setViewName("hello");
    return mv;
 }
}