package dbdemo.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/")
public class Htmlcontroller {
	
			@GetMapping(value = "insert")
			public ResponseEntity<?> insert(@RequestParam Map<String, String> param) {

				String uname = param.get("userName");
				String upass = param.get("email");
			
				System.out.println(param.put("Status", "Login Successfully"));

				return new ResponseEntity<>(param, HttpStatus.OK);

			}

		
	}

