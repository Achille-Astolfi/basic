package com.example.basic.protocol;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

import com.example.basic.controller.JoinController;
import com.example.basic.controller.SumController;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SumProtocol extends ResourceSupport {

    @JsonProperty("sum")
	private double sum;
	

    public SumProtocol() {
    	this.add(ControllerLinkBuilder.linkTo(SumController.class).withSelfRel());
    }
    
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	
}
