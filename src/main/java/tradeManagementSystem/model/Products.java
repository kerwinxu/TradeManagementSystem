package tradeManagementSystem.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.persistence.Id;

import lombok.Data;

/**
 * 产品表
 * @author kerwin
 *
 */
@Entity
@Data
@Table(name = "products")
public class Products {
	@Id
	private Integer  id; // id
	
	private Integer contactId; // 这个产品属于哪个联系人
	
	@OneToMany
	@JoinColumn(name="productId")
	private List<ProductPropertyValue> productPropertyValue;
	
}
