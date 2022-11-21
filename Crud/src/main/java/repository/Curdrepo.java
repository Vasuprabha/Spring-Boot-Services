package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Curdrepo<Users> extends JpaRepository<Users,Long>{
	
	List<Users> findByUsername(boolean username) ;
	List<Users> deleteUser(String user) ;


	
	
}
