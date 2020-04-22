package com.example.basic.protocol;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JoinProtocol {
	@JsonProperty("join")
	private String join ;

	public String getJoin() {
		return join;
	}

	public void setJoin(String info) {
		this.join = info;
	}
	
	 
	
}
