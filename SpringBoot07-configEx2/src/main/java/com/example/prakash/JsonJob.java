package com.example.prakash;

public class JsonJob {
	
	private String schedule;
	
	public final String getSchedule() {
		return schedule;
	}
	public final void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	@Override
	public String toString() {
		return "JsonJob [schedule=" + schedule + "]";
	}
	

}
