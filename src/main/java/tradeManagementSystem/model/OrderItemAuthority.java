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
 * 这个是订单项目的权限管理
 * @author kerwin
 *
 */
@Entity
@Getter
@Setter
@Table(name = "order_authority")
public class OrderItemAuthority {
	@Id
	@GeneratedValue
	private Integer  id; // id
	
	// 如下是一堆的外键
	@ManyToOne
	//@JoinColumn(name = "contactId")
	private Contact contact; // 联系人
	@ManyToOne
	//@JoinColumn(name = "orderItemId")
	private OrderItem orderItem; // 订单项目
	@ManyToOne
	//@JoinColumn(name = "authorityId")
	private Authority authority; // 权限

}
