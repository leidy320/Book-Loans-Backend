package com.book_loans.BookLoans.mapper;


import com.book_loans.BookLoans.dto.StudentDto;
import com.book_loans.BookLoans.entity.StudentEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IStudentMapper {
    StudentEntity tostudentEntity(StudentDto studentDto);
    List<StudentDto> tostudentgetEntity(List<StudentEntity> studentEntity);
}
