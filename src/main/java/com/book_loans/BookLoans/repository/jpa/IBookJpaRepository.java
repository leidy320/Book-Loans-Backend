package com.book_loans.BookLoans.repository.jpa;

import com.book_loans.BookLoans.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookJpaRepository extends JpaRepository<BookEntity, Long> {
}
