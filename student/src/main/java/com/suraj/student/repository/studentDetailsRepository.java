package com.suraj.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suraj.student.entity.studentDetails;

public interface studentDetailsRepository extends JpaRepository<studentDetails,Integer>{
    
}
