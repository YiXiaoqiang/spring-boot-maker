package com.sean.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMakerApplication.class, args);

//		new SpringApplicationBuilder()
//					.sources(Parent.class)
//				.child(Application.class)
//				.bannerMode(Banner.Mode.OFF)
//				.run(args);
	}

}
