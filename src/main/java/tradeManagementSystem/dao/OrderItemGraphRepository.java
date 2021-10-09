package tradeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tradeManagementSystem.model.OrderItemGraph;

public interface OrderItemGraphRepository extends JpaRepository<OrderItemGraph, Integer> {

}
