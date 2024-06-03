package com.suraj.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.suraj.student.entity.studentMarks;

public interface studentMarksRepository extends JpaRepository<studentMarks,Integer>{

    
    List<studentMarks> findFirst5ByOrderByMarksDesc();
    
}
