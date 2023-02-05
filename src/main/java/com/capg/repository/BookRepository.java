package com.capg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.entity.Book;

public interface BookRepository extends JpaRepository<Book,String> {
	public Book findByBookId(int bookId);

}
