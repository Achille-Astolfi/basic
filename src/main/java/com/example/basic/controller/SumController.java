package com.example.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.basic.dto.SumDto;
import com.example.basic.protocol.SumProtocol;
import com.example.basic.service.SumService;

@RestController
@RequestMapping("/sum")
public class SumController {
	
	@Autowired
	private SumService sumService;
	
	@PostMapping
	public ResponseEntity<SumProtocol> sum(@RequestBody SumDto sumDto) {
		
		SumProtocol protocol = new SumProtocol();
		
		HttpStatus status = null;
		 
		try {
			protocol.setSum(sumService.sum(sumDto.getAddend1(), sumDto.getAddend2()));
			
			status = HttpStatus.OK;
			
		} catch (Exception e) {
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		 
		
		return new ResponseEntity<SumProtocol>(protocol, status);
	}
}

	
	

	
