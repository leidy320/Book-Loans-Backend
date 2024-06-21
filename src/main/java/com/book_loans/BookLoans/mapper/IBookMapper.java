package com.book_loans.BookLoans.mapper;

import com.book_loans.BookLoans.dto.BookDto;
import com.book_loans.BookLoans.dto.LoanDto;
import com.book_loans.BookLoans.entity.BookEntity;
import com.book_loans.BookLoans.entity.LoanEntity;
import org.mapstruct.Mapper;


import java.util.List;

@Mapper(componentModel = "spring")
public interface IBookMapper {
   BookEntity tobookEntity(BookDto bookDto);
   List<BookDto> tobookgetEntity(List<BookEntity> bookEntity);
   LoanEntity toloanEntity(LoanDto loanDto);
}
