package com.bookstore.dao;

import java.sql.*;
import java.sql.Date;
import java.util.*;

import com.bookstore.dao.factory.DBConnectionFactory;
import com.bookstore.entities.Book;
import com.bookstore.exception.DataAccessException;
import com.bookstore.exception.ResourceNotFoundException;

public class BookDaoImplJDBC implements BookDao {

	private Connection connection;
	
	public BookDaoImplJDBC() {
		connection = DBConnectionFactory.getConnection();
	}
	
	@Override
	public List<Book> getAllBooks() {
		
// Fetch all books			
		List<Book> books = new ArrayList<Book>();
		Book book = null;
		
		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from books");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				book = new Book
						(rs.getString("isbn"),
						 rs.getString("title"),
						 rs.getString("author"),
						 rs.getDouble("price"),
						 rs.getDate("pubDate"));
				books.add(book);
			}
		} 

		catch (SQLException e) {
			throw new DataAccessException(e.toString());
		}
		
		
		return books;
		
	}

	@Override
	public Book getBookById(int id) {
		
		Book book = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from books where id=?");
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				book = new Book
						(rs.getString("isbn"),
					     rs.getString("title"),
					     rs.getString("author"),
					     rs.getDouble("price"),
					     rs.getDate("pubDate")
						);
			}
			else {
				throw new ResourceNotFoundException("Book with id := " + id + "is not found.");
			}
		} 
		
		catch (SQLException e) {
			throw new DataAccessException(e.toString());
		}
		
		return book;
		
	}

	@Override
	public Book addBook(Book book) {

		try {
			String INSERT_BOOK_QUERY = "insert into books (isbn, title, author, price, pubDate) values(?,?,?,?)";
			PreparedStatement pstmt = connection.prepareStatement(INSERT_BOOK_QUERY);
			pstmt.setString(1, book.getIsbn());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getAuthor());
			pstmt.setDouble(4, book.getPrice());
			pstmt.setDate(5, new Date(book.getPubDate().getTime()));		// need to convert util date to sql date
			
			pstmt.executeUpdate();
			
			ResultSet rs = pstmt.getGeneratedKeys();
			
			if(rs.next()) {
				book.setId(rs.getInt(1));
			}
		} 
		
		catch (SQLException e) {
			throw new DataAccessException(e.toString());
		}
		
		return book;
		
	}

	@Override
	public void deleteBook(int id) {

		try {
			PreparedStatement pstmt = connection.prepareStatement("delete from books where id=?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();	
		} 
		
		catch (SQLException e) {
			throw new DataAccessException(e.toString());
		}
		
	}

	@Override
	public void updateBook(int id, Book book) {
		
		try {
			String UPDATE_BOOK_QUERY = "update books set price=? where id=?";
			PreparedStatement pstmt = connection.prepareStatement(UPDATE_BOOK_QUERY);
			pstmt.setInt(1, id);
			pstmt.setDouble(1, book.getPrice());			
			
			pstmt.executeUpdate();
		} 
		
		catch (SQLException ex) {
			throw new DataAccessException(ex.toString());
		}
		
	}

	@Override
	public Book getBookByIsbn(String isbn) {
		
		Book book = null;
		
		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from books where isbn=?");
			pstmt.setString(1, isbn);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				book = new Book(
						rs.getString("isbn"), 
						rs.getString("title"), 
						rs.getString("author"),
						rs.getDouble("price"), 
						rs.getDate("pubDate"));
				
				book.setId(rs.getInt("id"));
			} 
			
			else {
				throw new ResourceNotFoundException("book with isbn :=" + isbn + " is not found");
			}
		} 
		
		catch (SQLException e) {
			throw new DataAccessException(e.toString());
		}
		
		return book;
	}	
	
}
