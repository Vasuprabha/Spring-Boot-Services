package Db.JdbcCont;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Db.Model.User;
import Db.repo.Repo;





@RestController
@RequestMapping("/insert/")
public class Controller {
	@Autowired
	Repo obj;
	

	@GetMapping(value = "testAPI1")
	public ResponseEntity<?> userInformation() {
		
		List<User> users = obj.isData();
			System.out.println("JDBC");
		
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
}
