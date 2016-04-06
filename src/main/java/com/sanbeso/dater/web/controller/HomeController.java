package com.sanbeso.dater.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    private static final String VIEW = "index";

    private static final Log LOGGER = LogFactory.getLog(HomeController.class);

    private static final Object[] NULL_PARAMS_FOR_MESSAGES = {};

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String show(Model model) {
        return VIEW;
    }
}
