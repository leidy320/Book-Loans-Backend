package com.book_loans.BookLoans.repository.impl;

import com.book_loans.BookLoans.entity.BookEntity;
import com.book_loans.BookLoans.repository.IBookRepository;
import com.book_loans.BookLoans.repository.jpa.IBookJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BookRepositoryImpl implements IBookRepository {
    public final IBookJpaRepository jpaRepository;

    public BookRepositoryImpl(IBookJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }


    @Override
    public void save(BookEntity bookEntityList) {
        jpaRepository.save(bookEntityList);
    }

    @Override
    public List<BookEntity> getBook() {
        return jpaRepository.findAll();
    }

    @Override
    public void updateBook(BookEntity bookEntity) {
        jpaRepository.save(bookEntity);
    }

    @Override
    public void deleteBook(Long id) {
        jpaRepository.deleteById(id);
    }

    @Override
    public Optional<BookEntity> findById(Long id) {
        return jpaRepository.findById(id);
    }
}
