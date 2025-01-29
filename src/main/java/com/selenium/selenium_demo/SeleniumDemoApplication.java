package com.selenium.selenium_demo;

//import org.springframework.boot.SpringApplication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class SeleniumDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SeleniumDemoApplication.class, args);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		System.out.println("Wikipedia main english page title is " + driver.getTitle());
		driver.navigate().to("https://start.spring.io/");
		System.out.println("Start Spring IO page title is " + driver.getTitle());
		driver.navigate().back();
		System.out.println("Page source " + driver.getPageSource());
		driver.quit();
	}

}
