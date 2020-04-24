package com.flight.scheduler.rest;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.scheduler.dto.ScheduleBean;


@RestController
public class FlightScheduleController {

	
	@PostMapping(path = "/schedule", consumes = "application/json", produces = "application/json")
	public boolean scheduleFlight(@RequestBody ScheduleBean sb) {
		System.err.println(" in post method");
		return true;
	}
	
}
