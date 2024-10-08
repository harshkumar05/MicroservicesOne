package com.msone.department_svc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DepartmentSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentSvcApplication.class, args);
	}

}
