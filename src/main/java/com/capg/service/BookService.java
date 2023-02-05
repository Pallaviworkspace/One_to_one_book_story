package com.capg.service;

import com.capg.entity.Book;

public interface BookService {
	
	public Book saveBook(Book book);
	public Book findByBookId(int bookId);

}
