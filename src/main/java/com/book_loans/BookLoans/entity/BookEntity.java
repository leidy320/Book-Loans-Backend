package com.book_loans.BookLoans.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name="book")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameAuthor;
    private LocalDate birthDate;
    private String placeBirth;
    private String nameBook;
    private LocalDate publicationDate;
    @OneToOne(mappedBy = "book")
    private LoanEntity loan;

}
