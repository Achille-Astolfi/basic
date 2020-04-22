package com.example.basic.protcol;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SquareProtocol {

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
