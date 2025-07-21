package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/employee";
		String user="root";
		String pwd="root";
		String query="insert into employeedetails values(0,?,?,?,?,?)";//values added at  place holders
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    
			con=DriverManager.getConnection(url, user, pwd);
			ps=con.prepareStatement(query);
			System.out.println("enter ur name");
			
			String namel=sc.next();
			System.out.println("enter phno");
			int phnno=sc.nextInt();
			System.out.println("enter mail");
			String mail=sc.next();
			System.out.println("enter location");
			String location=sc.next();
			System.out.println("enter pwd");
			String pwd1=sc.next();

		ps.setString(1,namel);
		ps.setInt(2, phnno);
		ps.setString(3, mail);
		ps.setString(4, location);
		ps.setString(5, pwd1);
		int res=ps.executeUpdate();
		System.out.println(res);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
