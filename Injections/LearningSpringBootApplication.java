package com.Yash.Learning_Spring_boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringBootApplication.class, args);
	}
	private Bean newbean;
	public LearningSpringBootApplication(Bean newbean) {
		this.newbean = newbean;
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println(newbean.PaymentService());
	}
}
