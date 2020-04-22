package com.example.basic.protocol;

import java.util.ArrayList;
import java.util.List;

public class SplitProtocol {
	
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
