package com.suraj.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suraj.student.entity.studentMarks;

public interface studentMarksRepository extends JpaRepository<studentMarks,Integer>{
    
}
