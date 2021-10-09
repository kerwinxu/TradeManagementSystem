package tradeManagementSystem.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * 产品表
 * @author kerwin
 *
 */
@Entity
@Getter
@Setter
@Table(name = "product")
public class Product {
	
	
	@Id
	@GeneratedValue
	private Integer  id; // id
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<ProductPropertyValue> productPropertyValue; // 产品属性值表
	
	@ManyToOne
	//@JoinColumn(name="productCategoryId")
	private ProductCategory productCategory; // 产品类别
	
	@JsonIgnore
	@ManyToOne
	//@JoinColumn(name = "contactId")
	private Contact contact;   // 属于那个联系人。
	
	@JsonIgnoreProperties(value = {"product"})
	@OneToMany()   // 是订单项目做主。也就是这个不做这个表项目。
	private List<OrderItem> orderItems;  // 具体的订单项目
	
	
	@OneToMany()   // 
	private List<ProductImage> productImages;  // 产品图片。
	
}
