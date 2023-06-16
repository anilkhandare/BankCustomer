package com.bank.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class CustomeDao {
  public static Connection dbConnection(){
	  Connection connection=null;
	  try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("mysql driver load sucessfully");
		
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/expertitbank","root","");
		System.out.println(" database connection established sucessfully");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
	  return connection;
	   
  }
  public static int addCustomer(Customer customer) {
	  int result=0;
	  Connection connection=null;
	  try {
		  connection=CustomeDao.dbConnection();
		  System.out.println("connection established");
		  String sql="insert into customer(cust_id,cust_name,cust_email,cust_contact,cust_address1,cust_address2,account_number) values(?,?,?,?,?,?,?)";
		  PreparedStatement  preparedStatement=(PreparedStatement) connection.prepareStatement(sql);
		  preparedStatement.setInt(1,customer.getCust_id());
		  preparedStatement.setString(2,customer.getCust_name());
		  preparedStatement.setString(3, customer.getCust_email());
		  preparedStatement.setString(4, customer.getCust_contact());
		  preparedStatement.setString(5, customer.getCust_address1());
		  preparedStatement.setString(6, customer.getCust_address2());
		  preparedStatement.setString(7, customer.getAccount_number());
		  result=preparedStatement.executeUpdate();
		  
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	  
	  
	  return result;
	  
  }
  public static int updateCustomer(Customer customer){
	  int result=0;
	  Connection connection=null;
	  try {
		  connection=CustomeDao.dbConnection();
		  String sql="update customer set cust_name=?,cust_email=?,cust_contact=?,cust_address1=?,cust_address2=?,account_number=? where cust_id=?";
		  PreparedStatement preparedStatement=(PreparedStatement) connection.prepareStatement(sql);
		  //preparedStatement.setInt(1, customer.getCust_id());
		  preparedStatement.setString(1, customer.getCust_name());
		  preparedStatement.setString(2, customer.getCust_email());
		  preparedStatement.setString(3,customer.getCust_contact());
		  preparedStatement.setString(4, customer.getCust_address1());
		  preparedStatement.setString(5, customer.getCust_address2());
		  preparedStatement.setString(6, customer.getAccount_number());
		  preparedStatement.setInt(7, customer.getCust_id());
		  System.out.println("after setting update customer param");
	
		  result=preparedStatement.executeUpdate();
		  System.out.println("after execute query");
		 
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	   return result;
	  
  }
  public static Customer getCustomerById(int cust_id){
	   Customer customer= new Customer();
	   Connection connection=null;
	   try {
		connection=CustomeDao.dbConnection();
		PreparedStatement preparedStatement=(PreparedStatement) connection.prepareStatement("select * from customer where cust_id=?");
	     preparedStatement.setInt(1, cust_id);

	     ResultSet rs=preparedStatement.executeQuery();
	     if(rs.next()){
	    	 customer.setCust_id(rs.getInt(1));
	    	 customer.setCust_name(rs.getString(2));
	    	 customer.setCust_email(rs.getString(3));
	    	 customer.setCust_contact(rs.getString(4));
	    	 customer.setCust_address1(rs.getString(5));
	    	 customer.setCust_address2(rs.getString(6));
	    	 customer.setAccount_number(rs.getString(7));
	    	 System.out.println("select record has been sucess="+customer.toString());
	    	 
	    	 
	     }
	   } catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally{
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	  
	  
	  return customer;
	  
  }
  
}
