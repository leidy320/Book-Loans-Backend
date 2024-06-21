package com.book_loans.BookLoans.repository.jpa;

import com.book_loans.BookLoans.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IStudentJpaRepository extends JpaRepository<StudentEntity, Long> {

    Optional<StudentEntity> findByidentificationDocument(String document);
}
