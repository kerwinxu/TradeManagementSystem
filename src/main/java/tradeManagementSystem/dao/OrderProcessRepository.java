package tradeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tradeManagementSystem.model.OrderProcess;

public interface OrderProcessRepository extends JpaRepository<OrderProcess, Integer> {

}
