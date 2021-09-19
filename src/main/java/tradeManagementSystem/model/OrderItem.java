package tradeManagementSystem.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
@Table(name = "order_item")
public class OrderItem {
	
	@Id
	private Integer  id; // id
	
	private Integer orderId;    // 订单号，
	
	private Integer productId; // 产品号
	
	private Float price; // 价格
	
	private Float quantity; // 数量
	
	private Integer nextOrderId;    // 下一个订单号，通常用于这个客户的订单的一个项目是别的供货的订单。

}
