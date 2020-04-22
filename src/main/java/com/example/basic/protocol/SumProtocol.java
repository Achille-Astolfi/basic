package com.example.basic.protocol;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SumProtocol {

    @JsonProperty("sum")
	private double sum;
	

	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	
}
