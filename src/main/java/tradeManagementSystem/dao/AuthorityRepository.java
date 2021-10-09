package tradeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tradeManagementSystem.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {

}
