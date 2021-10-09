package tradeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tradeManagementSystem.model.QuantityUnit;

public interface QuantityUnitRepository extends JpaRepository<QuantityUnit, Integer> {

}
