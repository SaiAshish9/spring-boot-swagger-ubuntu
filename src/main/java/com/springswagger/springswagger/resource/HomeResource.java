package com.springswagger.springswagger.resource;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeResource {

    @GetMapping
    public ModelAndView home(ModelMap modelMap){
        return new ModelAndView("redirect:swagger-ui.html",modelMap);
    }

}
