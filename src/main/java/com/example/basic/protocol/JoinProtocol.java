package com.example.basic.protocol;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

import com.example.basic.controller.JoinController;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JoinProtocol extends ResourceSupport{
	@JsonProperty("join")
	private String join ;

	public JoinProtocol() {
		this.add(ControllerLinkBuilder.linkTo(JoinController.class).withSelfRel());
	}

	public String getJoin() {
		return join;
	}

	public void setJoin(String info) {
		this.join = info;
	}
	
	 
	
}
