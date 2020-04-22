package com.example.basic.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.basic.service.SumService;

@Service("sumService")
public class SumServiceImpl implements SumService {

	@Override
	public double sum(double addend1, double addend2) {
		double result = addend1 + addend2;
		return result;
	}
}
