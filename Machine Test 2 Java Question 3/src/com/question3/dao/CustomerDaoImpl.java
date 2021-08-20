package com.question3.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.question3.dao.factory.DbConnectionFactory;
import com.question3.entities.Customer;
import com.question3.exceptions.CusotmerNotFoundException;
import com.question3.exceptions.DAOExceptions;

public class CustomerDaoImpl implements CustomerDao {

	private Connection connection;

	public CustomerDaoImpl() {
		connection = DbConnectionFactory.getConnection();
	}

	
	@Override
	public Customer addCustomer(Customer customer) throws DAOExceptions {
		
		String Insert_New_Customer = "insert into customer(name, address, phoneNumber, dob) values(?, ?, ?, ?)";
		
		try {
			
			PreparedStatement pstmt = (PreparedStatement) connection.prepareStatement(Insert_New_Customer, Statement.RETURN_GENERATED_KEYS);
			
			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getAddress());
			pstmt.setString(3, customer.getPhoneNumber());
			pstmt.setDate(4, new Date(customer.getDob().getTime()));

			int noOfAffectedRows = pstmt.executeUpdate();

			if (noOfAffectedRows > 0) {
				ResultSet rst = pstmt.getGeneratedKeys();
				rst.next();
				customer.setId(rst.getInt(1));
			}

		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return customer;
	}

	@Override
	public Customer findCustomerById(int id) throws CusotmerNotFoundException {
		
		Customer customer = null;
		try {

			String Find_Customer_By_Id = "select * from customer where id=?";

			PreparedStatement pstmt = (PreparedStatement) connection.prepareStatement(Find_Customer_By_Id);
			pstmt.setInt(1, id);

			ResultSet rst = pstmt.executeQuery();
			
			if (rst.next()) {
				customer = new Customer(rst.getInt("id"), 
										rst.getString("name"), 
										rst.getString("address"),
										rst.getString("phoneNumber"), 
										rst.getDate("dob")
						   );
			} 
			
			else {
				throw new CusotmerNotFoundException("customer not found with id : " + id);
			}
			
		} 
		
		catch (SQLException e) {
			throw new DAOExceptions(e.getMessage());
		}
		
		return customer;
	}
	
	
	
}
