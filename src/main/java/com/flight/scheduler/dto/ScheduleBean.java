package com.flight.scheduler.dto;

public class ScheduleBean {

	private String flightName;
	private String fromAirportCode;
	private String toAirportCode;
	private String scheduleTime;
	
	
	
	public ScheduleBean() {
		super();
	}
	public ScheduleBean(String flightName, String fromAirportCode, String toAirportCode, String scheduleTime) {
		super();
		this.flightName = flightName;
		this.fromAirportCode = fromAirportCode;
		this.toAirportCode = toAirportCode;
		this.scheduleTime = scheduleTime;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFromAirportCode() {
		return fromAirportCode;
	}
	public void setFromAirportCode(String fromAirportCode) {
		this.fromAirportCode = fromAirportCode;
	}
	public String getToAirportCode() {
		return toAirportCode;
	}
	public void setToAirportCode(String toAirportCode) {
		this.toAirportCode = toAirportCode;
	}
	public String getScheduleTime() {
		return scheduleTime;
	}
	public void setScheduleTime(String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}
	
	
	
}
