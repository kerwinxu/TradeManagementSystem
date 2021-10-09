package tradeManagementSystem.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.Nullable;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "role")
public class Role {
	
	// 如下是这个表本身的数据
	@Id
	@GeneratedValue
	private Integer  id; // id
	
	@Column(length = 100)
	private String name;  // 这个是角色名称
	
	@Nullable
	@ManyToOne(fetch=FetchType.LAZY) 
	//@JoinColumn()
	private Role parent;  // 父角色
	
	// 如下是这个表关联的表
	
	@ManyToMany()
	private List<User> users;
	
	
	@ManyToMany
	@JoinTable(name = "role_authorities",joinColumns = {
			@JoinColumn(name="role_id", referencedColumnName = "id")},inverseJoinColumns = {
					@JoinColumn(name="authoritie_id", referencedColumnName = "id")
			})
	private List <Authority> authorities;
}
