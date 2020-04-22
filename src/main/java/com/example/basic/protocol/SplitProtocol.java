package com.example.basic.protocol;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

import com.example.basic.controller.JoinController;
import com.example.basic.controller.SplitController;

public class SplitProtocol extends ResourceSupport {
	
	private List<String> cells;
	
	public SplitProtocol ()
	{
		cells = new ArrayList<String>();
		this.add(ControllerLinkBuilder.linkTo(SplitController.class).withSelfRel());
	}

	public List<String> getCells() {
		return cells;
	}

	public void setCells(List<String> cells) {
		this.cells = cells;
	}


	
}
