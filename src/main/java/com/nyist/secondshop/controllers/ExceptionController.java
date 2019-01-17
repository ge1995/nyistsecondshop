package com.nyist.secondshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * create by chao on 2018/5/30.
 */
@Controller
public class ExceptionController {
    @RequestMapping(value = "/error")
    public void toError(){
        int b=10/0;
        System.out.println(b);
    }
}
