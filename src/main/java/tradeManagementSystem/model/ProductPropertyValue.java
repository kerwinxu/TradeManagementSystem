package tradeManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * 属性值表
 * @author kerwin
 *
 */
@Entity
@Data
@Table(name = "product_property_value")
public class ProductPropertyValue {
	

	@Id
	@GeneratedValue
	private Integer  id; // id
	
	@ManyToOne
	//@JoinColumn(name = "productId")
	protected Product product;              // 产品。
	
	
	@ManyToOne
	//@JoinColumn(name = "productPropertyId")
	private ProductProperty productProperty; // 产品属性
	

	@Column
	private String value;       // 属性值。
	


}
