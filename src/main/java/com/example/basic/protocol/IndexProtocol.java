package com.example.basic.protocol;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

import com.example.basic.controller.SumController;

public class IndexProtocol extends ResourceSupport{
	
	public IndexProtocol() {
		this.add(ControllerLinkBuilder.linkTo(SumController.class).withRel("sum"));
	}

}
