package com.gajjelsa.SDMS.service;

import com.gajjelsa.SDMS.Student;
import com.gajjelsa.SDMS.dao.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImplement implements IStudentService
{
    @Autowired
    private StudentRepo repo;
    @Override
    public Student saveStudent(Student student){
       repo.save(student);
        return student;
    }
    @Override
    public List<Student> getAllStudents(){
        //add logic to return all students data from DB
         return repo.findAll();
    }
    @Override
    public Optional<Student> getStudentById(Integer id){
        //add logic to return  student data from DB by ID
        Optional<Student> fstudent = repo.findById(id);
        return fstudent;
    }

    @Override
    public void deleteStudentById(Integer id){
        //add logic to delete student data from DB
         repo.deleteById(id);
    }
}
