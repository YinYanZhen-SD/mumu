package com.icloud.mumu.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author YINYANZHEN
 * @date 2019/12/23 14:55
 */
@Controller
@RequestMapping("index")
public class Index {

    @RequestMapping("login")
    public ModelAndView index(){
        return new ModelAndView("index");
    }

    @RequestMapping("register")
    public ModelAndView register(){
        return new ModelAndView("register");
    }

}
