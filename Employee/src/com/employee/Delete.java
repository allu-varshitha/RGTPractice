package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/employee";
		String user="root";
		String pwd="root";
		Connection con=null;
		Statement st=null;
		String query="delete from employeedetails where namel='uday'";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, pwd);
			
			st=con.createStatement();
			 
			int res=st.executeUpdate(query);
			System.out.println(res);	
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}



	}


