package tradeManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
	private Integer  id; // id
	
	private Integer productId; // 产品id
	
	
	private Integer propertyId; // 属性id
	

	private String value;       // 属性值。
	
	@OneToOne
	@JoinColumn(name = "id", referencedColumnName = "Could not determine typ")
	private ProductProperty productProperty;

}
