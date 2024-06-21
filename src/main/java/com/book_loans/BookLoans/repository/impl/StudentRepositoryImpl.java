package com.book_loans.BookLoans.repository.impl;

import com.book_loans.BookLoans.entity.StudentEntity;
import com.book_loans.BookLoans.repository.IStudentRepository;
import com.book_loans.BookLoans.repository.jpa.IStudentJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepositoryImpl implements IStudentRepository {

    public final IStudentJpaRepository jpaRepository;

    public StudentRepositoryImpl(IStudentJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public void saveStudent(StudentEntity studentEntityList) {
        jpaRepository.save(studentEntityList);
    }

    @Override
    public List<StudentEntity> getStudents() {
        return jpaRepository.findAll();
    }

    @Override
    public void updateStudent(StudentEntity studentEntity) {
        jpaRepository.save(studentEntity);
    }

    @Override
    public void deleteStudent(Long id) {
        jpaRepository.deleteById(id);
    }


    @Override
    public Optional<StudentEntity> findByDocument(String document) {
        return jpaRepository.findByidentificationDocument(document);
    }
}
