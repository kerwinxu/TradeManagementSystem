package tradeManagementSystem.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * 订单表
 * @author kerwin
 *
 */
@Entity
@Data
@Table(name = "orders")
public class Orders {

	@Id
	private Integer  id; // id
	
	private String orderId; // 因为很多客户或者供货商的订单不一定是int类型。
	
	private Integer contactId;   // 联系人
	
	@JsonFormat(pattern = "yy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date time;
	
	private Boolean finish;
	
	@OneToOne
	@JoinColumn(referencedColumnName = "contactId")
	private Contacts contact;
	
	@OneToMany
	@JoinColumn(name="orderId")
	private List<OrderItem> orderItems; // 订单的详细。
	
}
