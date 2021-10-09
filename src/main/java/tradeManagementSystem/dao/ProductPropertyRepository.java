package tradeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tradeManagementSystem.model.ProductProperty;

public interface ProductPropertyRepository extends JpaRepository<ProductProperty, Integer> {

}
