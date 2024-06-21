package com.book_loans.BookLoans.repository.jpa;

import com.book_loans.BookLoans.entity.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILoanJpaRepository extends JpaRepository<LoanEntity,Long> {
}
