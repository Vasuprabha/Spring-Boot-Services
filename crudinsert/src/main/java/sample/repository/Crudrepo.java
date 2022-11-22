package sample.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import sample.model.Crudmodel;

@Configuration
@Repository
public class Crudrepo implements Crudinter {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void save(Crudmodel user) {
		jdbcTemplate.update("INSERT INTO VASU_USERS (U_NAME,E_MAIL) VALUES(?,?)",
				new Object[] { user.getU_NAME(), user.getE_MAIL() });
	}

}
