package com.gajjelsa.SDMS.service;

import com.gajjelsa.SDMS.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImplement implements IStudentService{

    @Override
    public Student saveStudent(Student student){

        return student;
    }
    @Override
    public List<Student> getAllStudents(){
        return new ArrayList<Student>();
    }
}
