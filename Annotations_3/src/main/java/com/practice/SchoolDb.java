package com.practice;

import org.springframework.stereotype.Repository;

@Repository
public class SchoolDb implements Report {

	public void getData() {

		System.out.println("Reports from school database");
	}

}
