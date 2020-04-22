package com.example.basic.serviceimpl;
// Commento
import com.example.basic.service.JoinService;

public class JoinServiceImpl implements JoinService {

	@Override
	public String joinString(String string1, String string2) {
		String finalString;
		finalString = string1 + string2;
		return finalString;
	}
	
	

}
