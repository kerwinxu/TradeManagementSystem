package tradeManagementSystem.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Data
@Table(name = "contacts")
public class Contacts {

	@Id
	private Integer  id; // id
	
	private Integer introducerId; // 介绍人的id
	
	@Column(length = 10)
	private String name; // 姓名
	
	@Column(length = 50)
	private String business_phone; // 办公电话
	
	@Column(length = 50)
	private String mobile_phone; // 手机 
	
	@Column(length = 50)
	private String email; // 电邮
	
	@Column(length = 100)
	private String company_name;  // 公司名
	
	@Column(length = 100)
	private String company_address;  // 公司地址
	
	@Column()
	private String remake;  // 备注
	
	@Column(length = 250)
	private String webside; // 网站
	
	
	
	@OneToMany
	@JoinColumn(name = "contactId")
	private List<Products> products; // 产品
	
	
}
