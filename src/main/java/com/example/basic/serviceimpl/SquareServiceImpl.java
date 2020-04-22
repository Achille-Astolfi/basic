package com.example.basic.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.basic.dto.SquareDto;
import com.example.basic.service.SquareService;

@Service("squareService")

public class SquareServiceImpl implements SquareService{
	
	public SquareDto square(double n)
	{
		SquareDto s= new SquareDto();
		s.setValue(n*n);
		return s;
	}
	
}
