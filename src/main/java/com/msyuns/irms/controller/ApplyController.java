package com.msyuns.irms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApplyController {

    @RequestMapping(value = "/apply", method = RequestMethod.GET)
    public String apply() {
        return "apply/index";
    }
}
