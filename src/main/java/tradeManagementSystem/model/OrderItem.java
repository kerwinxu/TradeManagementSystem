package tradeManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "order_item")
public class OrderItem {
	
	// 如下是这个表本身的数据
	
	@Id
	@GeneratedValue
	private Integer  id; // id
	
	@Column
	private Float price; // 价格
	
	@Column
	private Float quantity; // 数量
	
	// 一堆的外键存储的信息
	
	@JsonIgnore
	@ManyToOne
	//@JoinColumn(name = "orderId")
	protected Order order;              // 订单号。

	@JsonIgnoreProperties(value = {"orderItems"})
	@ManyToOne
	//@JoinColumn(name = "productId")
	protected Product product;              // 产品。
	
	@ManyToOne
	//@JoinColumn(name = "quantityUnitId")
	protected QuantityUnit quantityUnit;     // 数量单位
	
	@ManyToOne
	//@JoinColumn(name = "currencyUnitId")
	protected CurrencyUnit currencyUnit;     // 货币单位。

	@JsonIgnore
	@ManyToOne
	//@JoinColumn(name = "contactId")
	private Contact contact;               // 创建者。
	
}
