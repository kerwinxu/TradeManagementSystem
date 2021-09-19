package tradeManagementSystem.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;

import lombok.Data;

/**
 * 产品属性表
 * @author kerwin
 *
 */
@Entity
@Data
@Table(name = "product_property")
public class ProductProperty {
	
	@Id
	private Integer  id; // id
	
	private String name;
	
	private Integer  categoryId; // id
}
