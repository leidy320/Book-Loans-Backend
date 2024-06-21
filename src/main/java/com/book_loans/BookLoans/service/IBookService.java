package com.book_loans.BookLoans.service;

import com.book_loans.BookLoans.dto.BookDto;
import com.book_loans.BookLoans.dto.LoanDto;

import java.util.List;

public interface IBookService {
     void saveBook(BookDto bookDto);
     List<BookDto> getBook();
     void updateBook(BookDto bookDto);
     void deleteBook(Long id);
     void generateLoanBook(LoanDto loanDto);
}
