package tradeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tradeManagementSystem.model.User ;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User  findByUsername(String username);

}
