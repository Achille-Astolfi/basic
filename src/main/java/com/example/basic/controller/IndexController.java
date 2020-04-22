package com.example.basic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.basic.protocol.IndexProtocol;

@RestController
@RequestMapping("/")
public class IndexController {
	@GetMapping
	public ResponseEntity<IndexProtocol> getIndex() {
		IndexProtocol protocol = new IndexProtocol();

		// questa è una alternativa a scrivere
		// new ResponseEntity<>(protocol, status)
		// con status == HttpStatus.OK
		return ResponseEntity.ok(protocol);
	}
}
