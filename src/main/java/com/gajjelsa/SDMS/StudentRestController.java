package com.gajjelsa.SDMS;


import com.gajjelsa.SDMS.service.IStudentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class StudentRestController {

    private static final Logger logger = LoggerFactory.getLogger(StudentRestController.class);
    private final IStudentService service;

    @Autowired
    public StudentRestController(IStudentService service) {
        this.service = service;
    }

    @PostMapping("/Student")
    public ResponseEntity<Student> registerStudent(@RequestBody @Valid Student student) {
        logger.info("Registering student data: {}", student);
        Student savedStudent = service.saveStudent(student);
        return ResponseEntity.created(URI.create("/api/Student/" + savedStudent.getId())).body(savedStudent);
    }
    @GetMapping("/Students")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }
    @GetMapping("/Student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Integer id) {
        Optional<Student> studentOptional = service.getStudentById(id);

        return studentOptional.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    @DeleteMapping("/Student/{id}")
    public ResponseEntity<Void> deleteStudentById(@PathVariable Integer id) {
        Optional<Student> studentOptional = service.getStudentById(id);
        if (studentOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        service.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }
}