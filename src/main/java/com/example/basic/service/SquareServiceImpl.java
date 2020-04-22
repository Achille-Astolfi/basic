package com.example.basic.service;

import org.springframework.stereotype.Service;

import com.example.basic.dto.SquareDto;

@Service("squareService")

public class SquareServiceImpl implements SquareService{
	
	public SquareDto square(double n)
	{
		SquareDto s= new SquareDto();
		s.setValue(n*n);
		return s;
	}
	
}
