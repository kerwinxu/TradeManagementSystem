package tradeManagementSystem.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * 客户的订单项目对应着供货商的订单项目
 * @author kerwin
 *
 */
@Entity
@Data
@Table(name = "order_item_graph")
public class OrderItemGraph {
	

	@Id
	@GeneratedValue
	private Integer  id; // id
	
	@ManyToOne
	//@JoinColumn(name = "customer_order_item_id")
	private OrderItem customerOrderItem; // 客户订单项目
	
	@ManyToOne
	//@JoinColumn(name = "supplier_order_item_id")
	private OrderItem supplierOrderItem; // 供货商的订单项目

}
