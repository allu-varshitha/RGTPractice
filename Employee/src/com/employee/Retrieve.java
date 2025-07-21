package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Retrieve {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/employee";
		String user="root";
		String pwd="root";
		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;// to get the data we use result set interface-->used to pull the data from memory
			
		String query="select * from employeedetails";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, pwd);
			st=con.createStatement();
			rs=st.executeQuery(query);
		
			while(rs.next()) {// next used to return true data is available in the row
				int id=rs.getInt("id");
				System.out.println(id);
				String namel=rs.getString("namel");
				System.out.println(namel);
				
			}	
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
