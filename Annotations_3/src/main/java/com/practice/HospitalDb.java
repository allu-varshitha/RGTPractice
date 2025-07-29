package com.practice;

import org.springframework.stereotype.Repository;

@Repository("report")
public class HospitalDb implements Report {

	@Override
	public void getData() {
        
		System.out.println("Report from school database");
	}

}
