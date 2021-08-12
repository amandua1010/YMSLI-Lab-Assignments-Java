package com.bookstore.service;

import java.util.List;

import com.bookstore.entities.Book;

// Service layer = busin logic + ccc(logging spring)

public interface BookService {

	public List<Book> getAllBooks();

	public Book getBookById(int id);

	public Book addBook(Book book);

	public void deleteBook(int id);

	public void updateBook(int id, Book book);

	public Book getBookByIsbn(String isbn);

}
