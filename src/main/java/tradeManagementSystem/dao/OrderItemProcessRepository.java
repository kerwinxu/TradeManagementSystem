package tradeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tradeManagementSystem.model.OrderItemProcess;

public interface OrderItemProcessRepository extends JpaRepository<OrderItemProcess, Integer> {

}
