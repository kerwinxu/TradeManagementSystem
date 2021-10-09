package tradeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tradeManagementSystem.model.OrderAuthority;

public interface OrderAuthorityRepository extends JpaRepository<OrderAuthority, Integer> {

}
