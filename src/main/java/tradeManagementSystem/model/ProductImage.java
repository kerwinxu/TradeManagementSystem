package tradeManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

// 产品的图片
@Entity
@Setter
@Getter
@Table(name = "product_image")
public class ProductImage {

	@Id
	@GeneratedValue
	private Integer  id; // id
	
	@ManyToOne
	//@JoinColumn(name = "productId")
	protected Product product;              // 产品。
	
	@Column
	private String imagePath;   // 图片路径。
}
