package com.book_loans.BookLoans.repository;


import com.book_loans.BookLoans.entity.BookEntity;
import java.util.List;
import java.util.Optional;

public interface IBookRepository {

    void save(BookEntity bookEntityList);
    List<BookEntity> getBook();
    void updateBook(BookEntity bookEntity);
    void deleteBook(Long id);
    Optional<BookEntity> findById(Long id);
}
