package com.suraj.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suraj.student.entity.studentDetails;
import java.util.List;



public interface studentDetailsRepository extends JpaRepository<studentDetails,Integer>{

    studentDetails findByName(String name);
    studentDetails findByRollno(int rollno);
    
}
