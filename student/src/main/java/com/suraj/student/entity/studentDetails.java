package com.suraj.student.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class studentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;
    private String name;
    private String section;
    private int rollno;
    private List<String> subjects;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getSection() {
        return section;
    }


    public void setSection(String section) {
        this.section = section;
    }

    public int getRollno() {
        return rollno;
    }


    public void setRollno(int rollno) {
        this.rollno = rollno;
    }


    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

}
