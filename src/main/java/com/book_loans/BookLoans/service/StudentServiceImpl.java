package com.book_loans.BookLoans.service;

import com.book_loans.BookLoans.dto.StudentDto;
import com.book_loans.BookLoans.mapper.IStudentMapper;
import com.book_loans.BookLoans.repository.IStudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService{
    public final IStudentRepository studentRepository;
    public final IStudentMapper studentMapper;

    public StudentServiceImpl(IStudentRepository studentRepository, IStudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    @Override
    public void saveStudent(StudentDto studentDto) {
        studentRepository.saveStudent(studentMapper.tostudentEntity(studentDto));
    }

    @Override
    public List<StudentDto> getStudents() {
        return studentMapper.tostudentgetEntity(studentRepository.getStudents());
    }

    @Override
    public void updateStudent(StudentDto studentDto) {
        studentRepository.updateStudent(studentMapper.tostudentEntity(studentDto));
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteStudent(id);

    }
}
