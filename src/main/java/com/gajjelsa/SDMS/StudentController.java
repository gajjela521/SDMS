package com.gajjelsa.SDMS;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @RequestMapping("/home")
    public String greet(){
        return "Hi Bro, Welcome to page";
    }
    @RequestMapping("/logout")
    public String logout(){
        return "ByeBye";
    }
}
