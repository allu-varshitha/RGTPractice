package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/employee";//after creating the db we have add to  to the url
		                                                  //in the 4th step
		String user="root";
		String pwd="root";
		
		//write a query from 4th step
		
		String query="insert into employeedetails values(3,'uday',6303326354,'afgyt@com','dvk','be3fe2')";
		Connection con=null;// we have call connection outside the try block it is an good practice
		Statement st=null;
		
		
		//1 .loading and registering the driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded and registered");
			
			//2. establishing connection between java and database
	         con=DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection established");
               
			//3. creating a platform to execute sql queries
			
			st=con.createStatement();
			System.out.println("Platform created");
			
			//4. executing the sql queries
           //boolean res=st.execute(query);//return true if we use dql queries like select            
			// return false if we use dml queries like insert,update,delete
			int res=st.executeUpdate(query);//it only applicable for dml queries, true-->1 false-->0
			System.out.println(res);		
		} catch (ClassNotFoundException |SQLException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		

	} 

}
