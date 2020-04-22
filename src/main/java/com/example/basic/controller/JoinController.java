package com.example.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.basic.dto.JoinDto;
import com.example.basic.protocol.JoinProtocol;
import com.example.basic.service.JoinService;

@RestController
@RequestMapping("/join")
public class JoinController {
	
	@Autowired
	private JoinService joinService;
	
	@PostMapping
	public ResponseEntity<JoinProtocol> join(@RequestBody JoinDto joinDto) {
		
		JoinProtocol joinProtocol = new JoinProtocol();
		
		HttpStatus status = null;
		 
		try {
			
			
			joinProtocol.setJoin(joinService.joinString(joinDto.getLead(), joinDto.getTrail()));
			
			status = HttpStatus.OK;
			
		} catch (Exception e) {
			
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		 
		
		return new ResponseEntity<JoinProtocol>(joinProtocol, status);
	}

}
