package sample.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sample.model.Crudmodel;
import sample.repository.Crudrepo;
@RestController
@RequestMapping("/api/")
public class Crudcontroller {

	

		@Autowired
		Crudrepo obj;

		@GetMapping(value = "insert")
		public ResponseEntity<?> insert(@RequestParam Map<String, String> param) {

			Crudmodel data = new Crudmodel(param.get("name"), param.get("mail"));
			obj.save(data);
			System.out.println(param.put("Status", "Login Successfully"));

			return new ResponseEntity<>(param, HttpStatus.OK);

		}

	
}
