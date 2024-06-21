package com.book_loans.BookLoans.controller;


import com.book_loans.BookLoans.dto.BookDto;
import com.book_loans.BookLoans.dto.LoanDto;
import com.book_loans.BookLoans.service.IBookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/book")
public class BookController {
    public final IBookService iBookService;

    public BookController(IBookService iBookService) {
        this.iBookService = iBookService;
    }

    @PostMapping()
    public ResponseEntity<Void> saveBook(@RequestBody BookDto bookdto) {
        iBookService.saveBook(bookdto);
        return ResponseEntity.ok(null);
    }

    @GetMapping()
    public ResponseEntity<List<BookDto>> getBook() {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(iBookService.getBook());
    }

    @PutMapping()
    public ResponseEntity<Void> updateBook(@RequestBody BookDto bookdto) {
        iBookService.updateBook(bookdto);
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        iBookService.deleteBook(id);
        return ResponseEntity.ok(null);
    }

    @PostMapping("/loan")
    public ResponseEntity<Void> generateLoanBook(@RequestBody LoanDto loanDto) {
        iBookService.generateLoanBook(loanDto);
        return ResponseEntity.ok(null);
    }
}
