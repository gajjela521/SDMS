package com.gajjelsa.SDMS;

import com.gajjelsa.SDMS.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public  class StudentRestController {
    @Autowired
    private IStudentService service;
    @PostMapping("/Student")
    public Student registerStudent(@RequestBody Student student){
        System.out.println("student data"+student);
        Student st= service.saveStudent(student);
        return st;
    }
    @GetMapping("/Students")
    public List<Student> getAllStudents(){
        // invoke service that fetch all record of students
        List<Student> students=service.getAllStudents();
        return students;
    }
    @GetMapping("/Student/{id}")
    public Student getStudentById(@PathVariable Integer id){
        // invoke service that fetch all record of students
        // service.getStudentById(id)
        return new Student();
    }

    @PostMapping("/Student/{id}")
    public Student updateStudent(@PathVariable Integer id){
        //service.updateStudentById(id)
       return new Student();
    }
    @DeleteMapping("/Student/{id}")
    public ResponseEntity<Student> deleteStudentById(@PathVariable Integer id){
        //service.deleteStudentById(id)
     return ResponseEntity.noContent().build();
    }
}
