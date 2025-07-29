package com.practice;

import org.springframework.stereotype.Repository;

@Repository    // to perform create object & data base operations we use repository annotions
public interface Report {
	void getData();

}
