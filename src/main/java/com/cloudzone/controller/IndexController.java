package com.cloudzone.controller;

import com.cloudzone.common.entity.User;
import com.cloudzone.common.entity.UserExample;
import com.cloudzone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("aaa","122");
        return "login";
    }

    @RequestMapping("/login")
    public String login(User userVO, HttpServletRequest request) {
        if ("张三".equals(userVO.getUserName()) && "123456".equals(userVO.getPassword())) {
            request.getSession().setAttribute("张三", "123456");
            return "index";
        } else {
            return "login";
        }
        //        UserExample userExample = new UserExample();
        //        userExample.createCriteria().andUserNameEqualTo(userVO.getUserName()).andPasswordEqualTo(userVO.getPassword());
        //        List<User> userList = userService.selectByExample(userExample);
        //        if (userList.isEmpty()) {
        //            return "login";
        //        } else {
        //            return "index";
        //        }
    }

    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        if (null != request.getSession().getAttribute("张三")) {
            return "index";
        } else {
            return "login";
        }
    }

    @RequestMapping("/system")
    public String system() {
        return "system";
    }

    @RequestMapping("/msg")
    public String msg() {
        return "msg";
    }

    @RequestMapping("/open_source")
    public String openSource() {
        return "open_source";
    }

    @RequestMapping("/data_source")
    public String dataSource() {
        return "data_source";
    }

    @RequestMapping("/doc")
    public String doc() {
        return "doc";
    }

    @RequestMapping("/extension")
    public String extension() {
        return "extension";
    }

    @RequestMapping("/lang")
    public String lang() {
        return "lang";
    }
}
