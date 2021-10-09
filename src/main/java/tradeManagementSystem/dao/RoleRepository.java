package tradeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tradeManagementSystem.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
