package com.yourcompany.yourproject.service;

import com.yourcompany.yourproject.controller.HomeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author raqibul
 * @since 8/12/14 10:38 AM
 */
@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    HomeController homeController;

    @Override
    public String getMessage() {
        return homeController.sendGreetingMessage();
    }
}
