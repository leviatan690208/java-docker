package com.example.schedulingtasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

@SpringBootApplication
@EnableScheduling
public class SchedulingTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulingTasksApplication.class);



		// File file = new File("/app/config.yml");
        // ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        // ApplicationConfig config = objectMapper.readValue(file, ApplicationConfig.class);
        // System.out.println("Application config info " + config.toString());
	}
}
