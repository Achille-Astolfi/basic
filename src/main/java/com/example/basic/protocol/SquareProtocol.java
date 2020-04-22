package com.example.basic.protocol;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

import com.example.basic.controller.SquareController;
// COMMENTO FITTIZIO
import com.fasterxml.jackson.annotation.JsonProperty;

public class SquareProtocol extends ResourceSupport{

		public SquareProtocol() {
			this.add(ControllerLinkBuilder.linkTo(SquareController.class).withSelfRel());
		}
	
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
