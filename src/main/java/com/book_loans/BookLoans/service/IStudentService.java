package com.book_loans.BookLoans.service;

import com.book_loans.BookLoans.dto.StudentDto;

import java.util.List;

public interface IStudentService {
    void saveStudent(StudentDto studentDto);
    List<StudentDto> getStudents();
    void updateStudent(StudentDto studentDto);
    void deleteStudent(Long id);
}
