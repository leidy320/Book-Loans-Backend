package com.book_loans.BookLoans.controller;

import com.book_loans.BookLoans.dto.BookDto;
import com.book_loans.BookLoans.dto.StudentDto;
import com.book_loans.BookLoans.service.IStudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    public final IStudentService studentService;

    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping()
    public ResponseEntity<Void> saveStudent(@RequestBody StudentDto studentDto) {
        studentService.saveStudent(studentDto);
        return ResponseEntity.ok(null);
    }

    @GetMapping()
    public ResponseEntity<List<StudentDto>> getStudent() {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(studentService.getStudents());
    }

    @PutMapping()
    public ResponseEntity<Void> updateStudent(@RequestBody StudentDto studentDto) {
        studentService.updateStudent(studentDto);
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.ok(null);
    }
}
