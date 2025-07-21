package com.employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String url="jdbc:mysql://localhost:3306/employee";
		String user="root";
		String pwd="root";
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String query="select * from employeedetails where mail=? and pwd=?";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, pwd);
			ps=con.prepareStatement(query);
			System.out.println("enter mail");
			String mail=sc.next();
			System.out.println("enter pwd");
			String pwd1=sc.next();
			ps.setString(1, mail);
			ps.setString(2, pwd1);
			
			rs=ps.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("id");
				String namel=rs.getString("namel");
				
				System.out.println(id+" "+namel);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
