package com.suraj.student.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suraj.student.entity.studentDetails;
import com.suraj.student.repository.studentDetailsRepository;
import com.suraj.student.repository.studentMarksRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.util.ArrayList;



@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class studentController {

    @Autowired
    studentDetailsRepository detailsRepo;

    @Autowired
    studentMarksRepository marksRepo;

   @GetMapping("getAllStudent")
   public ResponseEntity<List<studentDetails>> getStudents(@RequestParam String param) {
        List<studentDetails> allStudents = new ArrayList<>();
        detailsRepo.findAll().forEach(allStudents::add);
        return new ResponseEntity<>(allStudents,HttpStatus.OK);
   }
   
   
    @PostMapping("createStudent")
    public ResponseEntity<studentDetails> createStudent(@RequestBody studentDetails details){
        try {
            studentDetails s = new studentDetails();
            s.setName(details.getName());
            s.setRollno(details.getRollno());
            s.setSection(details.getSection());
            s.setSubjects(details.getSubjects());
            return new ResponseEntity<studentDetails>(s,HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}