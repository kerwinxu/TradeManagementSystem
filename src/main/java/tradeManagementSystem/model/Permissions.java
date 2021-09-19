package tradeManagementSystem.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import javax.persistence.Id;

import lombok.Data;

/**
 * 权限表，表示这人拥有这些联系人的权限
 * @author kerwin
 *
 */
@Entity
@Data
@Table(name = "permissions")
public class Permissions {
	@Id
	private Integer  id; // id
	
	private Integer userId; // 用户id
	
	private Integer concactId; // 联系人id
	
	@OneToOne
	@JoinColumn(name = "id", referencedColumnName = "concactId")
	private Contacts contacts;

}
