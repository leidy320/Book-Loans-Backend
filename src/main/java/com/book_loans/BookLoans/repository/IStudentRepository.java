package com.book_loans.BookLoans.repository;


import com.book_loans.BookLoans.entity.StudentEntity;

import java.util.List;
import java.util.Optional;

public interface IStudentRepository {
    void saveStudent(StudentEntity studentEntity);
    List<StudentEntity> getStudents();
    void updateStudent(StudentEntity studentEntity);
    void deleteStudent(Long id);
    Optional<StudentEntity> findByDocument(String document);
}
