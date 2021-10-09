package tradeManagementSystem.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

/**
 * 订单表
 * @author kerwin
 *
 */
@Entity
@Setter
@Getter
@Table(name = "orders") // order 不能当作表名。
public class Order {

	@Id
	@GeneratedValue
	private Integer  id; // id
	
	@Column
	private String orderId; // 因为很多客户或者供货商的订单不一定是int类型。这里保存的是用户或者供货商的id
	
	@JsonFormat(pattern = "yy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date time;
	
	@Column
	private Boolean finish;
	
	@JsonIgnore // 我寻找订单的时候，并不需要给客户端返回这个信息。
	@ManyToOne
	//@JoinColumn(name = "contactId")
	private Contact contact;               // 创建者。
	
//	// 关联的表
//	@JsonIgnore
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER )
//	private List<OrderItem> orderItems; // 详细的订单项目
	
}
