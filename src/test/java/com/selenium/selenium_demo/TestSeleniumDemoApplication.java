package com.selenium.selenium_demo;

import org.springframework.boot.SpringApplication;

public class TestSeleniumDemoApplication {

	public static void main(String[] args) {
		SpringApplication.from(SeleniumDemoApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
