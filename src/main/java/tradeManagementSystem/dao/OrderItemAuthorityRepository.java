package tradeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tradeManagementSystem.model.OrderItemAuthority;

public interface OrderItemAuthorityRepository extends JpaRepository<OrderItemAuthority, Integer> {

}
