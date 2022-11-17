package com.sample.contro;
	import java.util.ArrayList;
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;

import com.sample.Model.User;
import com.sample.repo.Repo;


	@RestController
	@RequestMapping("/insert/")
	public class Controller {
		@Autowired
		 Repo obj;

		@GetMapping(value = "testAPI1")
		  public ResponseEntity<?>userInformation() {
			
		      List<User> userDb = obj.isData();
		      return new ResponseEntity<>( userDb,HttpStatus.OK);

		}}
