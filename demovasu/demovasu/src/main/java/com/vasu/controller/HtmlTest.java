package com.vasu.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login/")
public class HtmlTest {
	@RequestMapping(value = "Htmldemo", method = RequestMethod.GET)
	public ResponseEntity<?> Htmldemo(@RequestParam Map<String, String> input) throws Exception {
	String uname = input.get("userName");
	String upass = input.get("password");

	String Name = "Mithra";
	String pass = "1805";
	if (Name.equals(uname) && pass.equals(upass)) {
	input.put("Staus", "Login Sucessfully");
	} else {
	input.put("Staus", "Login Failed");

	}
	return new ResponseEntity<>(input, HttpStatus.OK);

	}

}
