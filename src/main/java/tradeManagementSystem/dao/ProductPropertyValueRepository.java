package tradeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tradeManagementSystem.model.ProductPropertyValue;

public interface ProductPropertyValueRepository extends JpaRepository<ProductPropertyValue, Integer> {

}
