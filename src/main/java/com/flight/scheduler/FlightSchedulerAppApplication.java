package com.flight.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan(basePackages = {"com.flight.scheduler","com.flight.scheduler.config","com.flight.scheduler.rest"})
public class FlightSchedulerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightSchedulerAppApplication.class, args);
	}

}
