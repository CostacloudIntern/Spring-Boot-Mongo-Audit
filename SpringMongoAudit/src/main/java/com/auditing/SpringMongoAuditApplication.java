package com.auditing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class SpringMongoAuditApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoAuditApplication.class, args);
	}
}
