package tradeManagementSystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "contact_authority")
public class ContactAuthority {

	@Id
	@GeneratedValue
	private Integer  id; // id
	
	// 如下是一堆的外键
	@ManyToOne
	//@JoinColumn(name = "contactId")
	private Contact contact; // 联系人，这个联系人拥有如下联系人的权限。
	
	@ManyToOne
	//@JoinColumn(name = "contactDestId")
	private Contact	 contactdest; // 
	
	@ManyToOne
	//@JoinColumn(name = "authorityId")
	private Authority authority; // 权限
}
