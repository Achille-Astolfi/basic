package com.example.basic.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.basic.dto.SquareDto;
import com.example.basic.service.SquareService;

@Service("squareService")

public class SquareServiceImpl implements SquareService{
	
	public double square(double n)
	{
		return n*n;
	}
	
}
