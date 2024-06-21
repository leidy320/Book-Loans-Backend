package com.book_loans.BookLoans.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class BookDto {
    Long id;
    String nameAuthor;
    LocalDate birthDate;
    String placeBirth;
    String nameBook;
    LocalDate publicationDate;
}
