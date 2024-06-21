package com.book_loans.BookLoans.dto;

import com.book_loans.BookLoans.entity.BookEntity;
import com.book_loans.BookLoans.entity.StudentEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class LoanDto {
    Long bookId;
    String studentDocument;
    Integer timeReturn;
}
