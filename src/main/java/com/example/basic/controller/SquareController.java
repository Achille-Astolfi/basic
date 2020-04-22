package com.example.basic.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.basic.dto.SquareDto;
import com.example.basic.protocol.SquareProtocol;
import com.example.basic.service.SquareService;

@RestController
public class SquareController {

	@Autowired
	private SquareService squareService;
	
	@PostMapping("/square/{num}")
	public ResponseEntity<SquareProtocol> sum(@RequestBody SquareDto squareDto) {
		
		SquareProtocol squareProtocol = new SquareProtocol();
		HttpStatus status = null;
		try {
			squareProtocol.setSquare(squareDto.getValue());
			status = HttpStatus.OK;
		} catch (Exception e) {
			status = HttpStatus.INTERNAL_SERVER_ERROR;
			e.printStackTrace();
		}
		return new ResponseEntity<SquareProtocol>(squareProtocol, status);
	}
}
