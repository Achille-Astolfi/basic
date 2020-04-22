package com.example.basic.protcol;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SquareProtocol {

		@JsonProperty("square")
		private float square;
		
		//GETTERS AND SETTERS
		
		public float getSquare() {
			return square;
		}
		public void setSquare(float square) {
			this.square = square;
		}
}
