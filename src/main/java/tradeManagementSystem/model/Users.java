package tradeManagementSystem.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class Users {
	
	@Id
	private Integer  id; // id
	
	@OneToOne
	@JoinColumn(name = "id")
	private Contacts contact;
	
	@Column(name = "user_name", length = 20)
	private String username;
	
	@Column(length = 20)
	private String password;
	
	@OneToMany
	@JoinColumn(name = "userId", referencedColumnName = "id")
	private List<Permissions> permissions;

}
