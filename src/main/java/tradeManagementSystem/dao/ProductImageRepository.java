package tradeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tradeManagementSystem.model.ProductImage;

public interface ProductImageRepository extends JpaRepository<ProductImage, Integer> {

}
