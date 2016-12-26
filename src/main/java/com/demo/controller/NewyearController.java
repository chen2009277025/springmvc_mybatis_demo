package com.demo.controller;

import com.demo.service.NewyearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by chenjianhui on 16/12/22.
 */
@Controller
@RequestMapping("/test")
public class NewyearController {

    @Autowired
    private NewyearService newyearService;

    @RequestMapping(value="/test")
    public ModelAndView toStaffMain(Long funcId){
        ModelAndView a = new ModelAndView("test/test");
        a.addObject("test",newyearService.getNewYear());
        return a;
    }
}
