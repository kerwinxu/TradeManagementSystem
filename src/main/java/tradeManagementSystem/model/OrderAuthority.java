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
 * 这个是订单的权限管理
 * @author kerwin
 *
 */
@Entity
@Getter
@Setter
@Table(name = "order_authority")
public class OrderAuthority {
	@Id
	@GeneratedValue
	private Integer  id; // id
	
	// 如下是一堆的外键
	@ManyToOne
	//@JoinColumn(name = "contactId")
	private Contact contact; // 联系人
	@ManyToOne
	//@JoinColumn(name = "orderId")
	private Order order; // 产品
	@ManyToOne
	//@JoinColumn(name = "authorityId")
	private Authority authority; // 权限

}
