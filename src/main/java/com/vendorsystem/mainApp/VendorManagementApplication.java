package com.vendorsystem.mainApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class VendorManagementApplication {

	public static void main(String[] args) {
		
		ApplicationContext context=SpringApplication.run(VendorManagementApplication.class, args);


		Dev obj =context.getBean(Dev.class);

		obj.build();
	}

}
