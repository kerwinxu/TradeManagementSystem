package tradeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tradeManagementSystem.model.Product;

public interface ProductRepository extends JpaRepository<Product,  Integer> {

}
