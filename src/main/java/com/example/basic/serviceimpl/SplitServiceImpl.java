package com.example.basic.serviceimpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.basic.service.SplitService;

@Service("splitService")
public class SplitServiceImpl implements SplitService{

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
