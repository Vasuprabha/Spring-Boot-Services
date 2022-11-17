package com.sample.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.Model.User;

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

//	User user = new User();
data.setU_NAME((String) row.get("U_NAME"));
data.setE_MAIL((String) row.get("E_MAIL"));		
		}
			return users ;
	}
	}




