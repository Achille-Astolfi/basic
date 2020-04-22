package com.example.basic.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.basic.dto.SplitDto;
import com.example.basic.protocol.SplitProtocol;
import com.example.basic.protocol.SquareProtocol;
import com.example.basic.protocol.SumProtocol;
import com.example.basic.service.SplitService;
import com.example.basic.serviceimpl.SplitServiceImpl;


@RestController
@RequestMapping("/split")
public class SplitController {

	@Autowired
	private SplitService splitService;
	
	@PostMapping
	public ResponseEntity<SplitProtocol> split( @RequestBody SplitDto splitDto) {
		
		SplitProtocol protocol = new SplitProtocol();
		HttpStatus status = null;
		try {
			
			protocol.setCells((splitService.splitString(splitDto.getRecord(), splitDto.getSeparator())));;	
			status = HttpStatus.OK;
			
	} 
		
		catch (Exception e) {
		status = HttpStatus.INTERNAL_SERVER_ERROR;
		e.printStackTrace(); 
	}
		return new ResponseEntity<SplitProtocol>(protocol,status);
		
	}

}
