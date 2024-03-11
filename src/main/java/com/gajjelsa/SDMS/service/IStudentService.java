package com.gajjelsa.SDMS.service;

import com.gajjelsa.SDMS.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Optional<Student> getStudentById(Integer id);
    public void deleteStudentById(Integer id);
}
