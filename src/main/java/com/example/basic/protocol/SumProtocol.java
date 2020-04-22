package com.example.basic.protocol;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SumProtocol extends ResourceSupport {

    @JsonProperty("sum")
	private double sum;
	

	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	
}
