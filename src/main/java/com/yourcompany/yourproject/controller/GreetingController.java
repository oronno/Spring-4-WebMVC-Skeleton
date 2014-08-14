package com.yourcompany.yourproject.controller;

import com.yourcompany.yourproject.service.HomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author raqibul
 * @since 8/14/14 12:53 PM
 */
@Controller
public class GreetingController {

    @Autowired
    HomeService homeService;

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String sendGreeting(ModelMap model) {
        log.debug("at greeting page");

        String greetingMessage = homeService.getMessage();
        model.addAttribute("msg", greetingMessage);

        return "greeting";
    }
}
