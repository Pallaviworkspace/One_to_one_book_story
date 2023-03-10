package com.capg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entity.Book;
import com.capg.entity.Story;
import com.capg.repository.BookRepository;
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		Story story=book.getStory();
		story.setBook(book);
		book=bookRepository.save(book);
		return book;
	}

	@Override
	public Book findByBookId(int bookId) {
		// TODO Auto-generated method stub
		Book book=bookRepository.findByBookId(bookId);
		return book;
	}

}
