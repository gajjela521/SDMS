package com.gajjelsa.SDMS;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    @PostMapping("/Student")
    public Student registerStudent(@RequestBody Student student){
        System.out.println("student data"+student);
        return student;
    }
}
