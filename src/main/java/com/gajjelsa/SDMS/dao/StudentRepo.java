package com.gajjelsa.SDMS.dao;

import com.gajjelsa.SDMS.Student;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
