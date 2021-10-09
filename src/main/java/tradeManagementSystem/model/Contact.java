package tradeManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

// 联系人表
@Entity
@Setter
@Getter
@Table(name = "contact")
public class Contact {
	
	/**
	 * 如下是一堆联系人的信息，并没有关联其他表的信息，主要是为了不增加数据库查询次数。
	 */
	@Id
	@GeneratedValue
	private Integer  id; // id
	
	@Column(length = 100)
	private String name; // 姓名
	
	@Column(length = 100)
	private String business_phone; // 办公电话
	
	@Column(length = 100)
	private String mobile_phone; // 手机 
	
	@Column(length = 100)
	private String email; // 电邮
	
	@Column(length = 200)
	private String company_name;  // 公司名
	
	@Column(length = 200)
	private String company_address;  // 公司地址
	
	@Column()
	private String remake;  // 备注
	
	@Column(length = 250)
	private String webside; // 网站
	
	// 关联的表,这里就不关联产品，订单或者订单项目等等了，如果要寻找某个联系人的产品，在产品权限中查询吧。
	
//	// 产品
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "contactId")
//	private List<Products> products;
//	// 订单
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "contactId")
//	private List<Order> orders;
//	// 订单项目
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "contactId")
//	private List<OrderItem> orderItems;
}
