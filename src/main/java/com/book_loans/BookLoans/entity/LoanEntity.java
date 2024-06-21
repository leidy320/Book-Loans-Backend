package com.book_loans.BookLoans.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name="loan")
public class LoanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "student_id")
    private StudentEntity student;
    @OneToOne
    @JoinColumn(name = "book_id")
    private BookEntity book;
    private LocalDate dateTake;
    private Integer timeReturn;
}
