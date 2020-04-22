package com.example.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.basic.dto.JoinDto;
import com.example.basic.dto.SquareDto;
import com.example.basic.service.SquareService;

@RestController
public class SquareController implements SquareService{

	@Override
	public SquareDto square(double n) {
		// TODO Auto-generated method stub
		return null;
	}
}
