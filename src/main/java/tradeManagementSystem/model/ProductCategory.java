package tradeManagementSystem.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

// 产品类别表
@Entity
@Getter
@Setter
@Table(name = "products_category")
public class ProductCategory {
	@Id
	private Integer  id; // id
	
	// 类别名称
	@Column
	private String name;
	
	// 如下是这个表关联的表。	
	@ManyToMany
	@JoinTable(name = "products_category_product_property",joinColumns = {
			@JoinColumn(name="products_category_id", referencedColumnName = "id")},inverseJoinColumns = {
					@JoinColumn(name="product_property_id", referencedColumnName = "id")
				})
	private List <ProductProperty> productProperties;
}
