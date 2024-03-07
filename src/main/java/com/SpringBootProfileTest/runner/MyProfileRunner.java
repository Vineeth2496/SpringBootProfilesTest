package com.SpringBootProfileTest.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "my.app")
public class MyProfileRunner implements CommandLineRunner {
	
	private String driver;
	private String url;
		
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Done");
		System.out.println(this);
	}

}
