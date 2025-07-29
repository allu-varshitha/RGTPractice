package com.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
@Service
public class ReportService {
	
	@Autowired
	private Report report;
	
	@Bean
	void getReportService(){
		report.getData();
		
	}

}
