package tradeManagementSystem.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
@Table(name = "products_category")
public class ProductCategory {
	@Id
	private Integer  id; // id
	
	private String name;
	
	@OneToMany
	@JoinColumn(name = "categoryId",referencedColumnName = "id")
	private List<Products> products;
	
	@OneToMany
	@JoinColumn(name = "categoryId")
	private List<ProductProperty> productProperties;
}
