package com.book_loans.BookLoans.repository.impl;

import com.book_loans.BookLoans.entity.LoanEntity;
import com.book_loans.BookLoans.repository.ILoanRepository;
import com.book_loans.BookLoans.repository.jpa.ILoanJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class LoanRepositoryImpl implements ILoanRepository {

    public  final ILoanJpaRepository jpaRepository;

    public LoanRepositoryImpl(ILoanJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public void generateLoanBook(LoanEntity loanEntity) {
        jpaRepository.save(loanEntity);
    }
}
