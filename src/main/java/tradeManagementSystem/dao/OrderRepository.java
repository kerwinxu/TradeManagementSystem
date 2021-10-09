package tradeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tradeManagementSystem.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
