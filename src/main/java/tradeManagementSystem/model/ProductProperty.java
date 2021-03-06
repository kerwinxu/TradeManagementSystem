package tradeManagementSystem.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * 产品属性表
 * @author kerwin
 *
 */
@Entity
@Getter
@Setter
@Table(name = "product_property")
public class ProductProperty {
	
	@Id
	@GeneratedValue
	private Integer  id; // id
	
	@Column
	private String name;
	
	@ManyToMany(mappedBy = "productProperties")
	private List<ProductCategory> productCategories;
	
}
