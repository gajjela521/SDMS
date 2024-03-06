package com.gajjelsa.SDMS.service;

import com.gajjelsa.SDMS.Student;

import java.util.List;

public interface IStudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
