package com.book_loans.BookLoans.service;

import com.book_loans.BookLoans.dto.BookDto;
import com.book_loans.BookLoans.dto.LoanDto;
import com.book_loans.BookLoans.entity.BookEntity;
import com.book_loans.BookLoans.entity.LoanEntity;
import com.book_loans.BookLoans.entity.StudentEntity;
import com.book_loans.BookLoans.mapper.IBookMapper;
import com.book_loans.BookLoans.repository.IStudentRepository;
import com.book_loans.BookLoans.repository.impl.BookRepositoryImpl;
import com.book_loans.BookLoans.repository.IBookRepository;
import com.book_loans.BookLoans.repository.ILoanRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@Service
public class BookServiceImpl implements IBookService {
    public final IBookRepository bookRepository;
    public final IBookMapper iBookMapper;
    public final ILoanRepository loanRepository;
    public final IStudentRepository studentRepository;

    public BookServiceImpl(BookRepositoryImpl bookRepository, IBookMapper iBookMapper, ILoanRepository loanRepository, IStudentRepository studentRepository) {
        this.bookRepository = bookRepository;
        this.iBookMapper = iBookMapper;
        this.loanRepository = loanRepository;
        this.studentRepository = studentRepository;
    }

    @Override
    public void saveBook(BookDto bookDto) {
        BookEntity book = iBookMapper.tobookEntity(bookDto);
        bookRepository.save(book);
    }

    @Override
    public List<BookDto> getBook() {
        List<BookEntity> bookEntityList = bookRepository.getBook();
        return iBookMapper.tobookgetEntity(bookEntityList);
    }

    @Override
    public void updateBook(BookDto bookDto) {
        BookEntity book = iBookMapper.tobookEntity(bookDto);
        bookRepository.updateBook(book);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteBook(id);
    }

    @Override
    public void generateLoanBook(LoanDto loanDto) {

        Optional<BookEntity> bookEntityOptional = bookRepository.findById(loanDto.getBookId());
        Optional<StudentEntity> studentEntityOptional =
                studentRepository.findByDocument(loanDto.getStudentDocument());
        if (bookEntityOptional.isPresent() && studentEntityOptional.isPresent()) {
            LoanEntity loan = iBookMapper.toloanEntity(loanDto);
            loan.setStudent(studentEntityOptional.get());
            loan.setBook(bookEntityOptional.get());
            loan.setDateTake(LocalDate.now());
            loanRepository.generateLoanBook(loan);
        }
    }
}
