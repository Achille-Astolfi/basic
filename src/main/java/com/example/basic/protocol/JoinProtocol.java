package com.example.basic.protocol;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JoinProtocol extends ResourceSupport{
	@JsonProperty("join")
	private String join ;

	public String getJoin() {
		return join;
	}

	public void setJoin(String info) {
		this.join = info;
	}
	
	 
	
}
