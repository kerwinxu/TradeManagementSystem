package tradeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tradeManagementSystem.model.ProcessState;

public interface ProcessStateRepository extends JpaRepository<ProcessState, Integer> {

}
