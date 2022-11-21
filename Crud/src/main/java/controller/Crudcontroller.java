package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Users;
import repository.Curdrepo;
@RestController
@RequestMapping("/api/")
public class Crudcontroller {

	@Autowired
	Curdrepo rpo;
@GetMapping("test/id") 
public ResponseEntity<List<Users>> findByUsername(){
	try {
		List<Users> users = rpo.findByUsername(true);
		return new ResponseEntity<>(users,HttpStatus.OK);

		
	} catch (Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

	}
	
}



	
}
