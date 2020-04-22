package com.example.basic.protocol;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.ResourceSupport;

public class SplitProtocol extends ResourceSupport {
	
	private List<String> cells;
	
	public SplitProtocol ()
	{
		cells = new ArrayList<String>();
		
	}

	public List<String> getCells() {
		return cells;
	}

	public void setCells(List<String> cells) {
		this.cells = cells;
	}


	
}
