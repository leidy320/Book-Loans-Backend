package com.book_loans.BookLoans.repository;

import com.book_loans.BookLoans.entity.LoanEntity;

public interface ILoanRepository {
    void generateLoanBook (LoanEntity loanEntity);
}
