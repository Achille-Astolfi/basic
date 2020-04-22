package com.example.basic.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JoinDto {
	
	@JsonProperty("lead")
	private String lead;
	
	@JsonProperty("trail")
	private String trail;

	public String getLead() {
		return lead;
	}

	public void setLead(String lead) {
		this.lead = lead;
	}

	public String getTrail() {
		return trail;
	}

	public void setTrail(String trail) {
		this.trail = trail;
	}
}
