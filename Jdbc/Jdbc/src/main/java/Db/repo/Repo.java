package Db.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Db.Model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class Repo {

	@Autowired
	JdbcTemplate jdbcTemplate;

	static final String SQL = "select * from VASU_USERS";
	
	public List<User> isData() {
		List<User> users = new ArrayList<User>();

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);

		for (Map<String, Object> row : rows) {
			User data = new User();

			User user = new User();
			user.setU_NAME((String) row.get("U_NAME"));
			user.setE_MAIL((String) row.get("E_MAIL"));
		
			
	}
		return users ;
}
}

