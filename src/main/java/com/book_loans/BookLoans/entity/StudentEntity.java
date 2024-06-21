package com.book_loans.BookLoans.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nameStudent;
    private String identificationDocument;
    private String program;
}
