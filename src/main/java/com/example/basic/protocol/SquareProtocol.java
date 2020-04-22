package com.example.basic.protocol;

import org.springframework.hateoas.ResourceSupport;

// COMMENTO FITTIZIO
import com.fasterxml.jackson.annotation.JsonProperty;

public class SquareProtocol extends ResourceSupport{

		@JsonProperty("square")
		private double square;
		
		//GETTERS AND SETTERS
		
		public double getSquare() {
			return square;
		}
		public void setSquare(double square) {
			this.square = square;
		}
}
