package com.example.basic.protocol;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SumProtocol {

    @JsonProperty("SUM")
	private int sum;
	

	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
}
