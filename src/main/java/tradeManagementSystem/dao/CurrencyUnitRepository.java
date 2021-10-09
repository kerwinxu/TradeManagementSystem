package tradeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tradeManagementSystem.model.CurrencyUnit;

public interface CurrencyUnitRepository extends JpaRepository<CurrencyUnit, Integer> {

}
