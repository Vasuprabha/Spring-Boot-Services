package Db.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import Db.Model.User;

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

		//	User user = new User();
			data.setUsername((String) row.get("U_NAME"));
			data.setEmail((String) row.get("E_MAIL"));		
			
			users.add(data);
	}
		
		return users ;
}
}

