package tradeManagementSystem.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

// 权限表。内容只是一个权限名称而已。
@Entity
@Getter
@Setter
@Table(name = "authority")
public class Authority {
	
	// 如下是这个表本身的数据
	@Id
	@GeneratedValue
	private Integer  id; // id
	
	@Column(length = 100)
	private String name;  // 这个是名称
	
	
	// 如下是这个表关联的表。权限表只跟角色表有关联。
	@ManyToMany()
	private List<Role> roles;

}
