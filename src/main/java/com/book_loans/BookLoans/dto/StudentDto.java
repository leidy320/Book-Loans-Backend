package com.book_loans.BookLoans.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDto {
    Long id;
    String nameStudent;
    String identificationDocument;
    String program;
}
