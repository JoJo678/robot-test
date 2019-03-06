package com.example.robotrestserverapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RobotRestserverapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RobotRestserverapiApplication.class, args);
	}

}


