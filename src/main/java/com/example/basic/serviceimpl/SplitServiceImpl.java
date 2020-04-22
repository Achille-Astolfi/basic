package com.example.basic.serviceimpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.basic.service.SplitService;

@RestController
public class SplitServiceImpl implements SplitService{

@Autowired
private SplitService splitService;

@Override
@PostMapping("/split")	
	public List<String> splitString(String record, String separtor){
		String sep=separtor;
		String complete=record;
		String[] stringList=complete.split(sep);		
		return Arrays.asList(stringList)
;
	}
}
