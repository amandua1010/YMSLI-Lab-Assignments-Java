package com.bookstore.controller;

import com.bookstore.entities.Book;
import com.bookstore.service.BookService;
import com.bookstore.service.BookServiceImpl;

public class Main {

	public static void main(String[] args) {
		
		BookService bookService=new BookServiceImpl();
		for(Book book:bookService.getAllBooks()) {
			System.out.println(book.toString());
			
		}
	}
}
