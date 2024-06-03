package com.suraj.student.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class studentMarks {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int rollno;
    private int marks;

}
