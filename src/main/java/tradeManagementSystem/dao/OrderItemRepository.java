package tradeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tradeManagementSystem.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
