package tradeManagementSystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * 这个是产品权限系统
 * @author kerwin
 *
 */
@Entity
@Getter
@Setter
@Table(name = "product_authority")
public class ProductAuthority {
	@Id
	@GeneratedValue
	private Integer  id; // id
	
	// 如下是一堆的外键
	@ManyToOne
	//@JoinColumn(name = "contactId")
	private Contact contact; // 联系人
	@ManyToOne
	//@JoinColumn(name = "productId")
	private Product product; // 产品
	@ManyToOne
	//@JoinColumn(name = "authorityId")
	private Authority authority; // 权限

}
