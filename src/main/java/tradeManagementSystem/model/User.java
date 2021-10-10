package tradeManagementSystem.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user")

public class User implements UserDetails{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 如下是这个表本身的数据
	
	@Id
	@GeneratedValue
	private Integer  id; // id
	
	// 用户名
	@Column(name = "user_name", length = 20)
	private String username;
	
	// 密码
	@Column(length = 20)
	private String password;
	
	
	// 这个对应的是某个联系人。
	@ManyToOne
	//@JoinColumn(name = "contactId")
	private Contact contact;
	
	// 如下是这个表关联的表。	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "user_role",
			joinColumns = {@JoinColumn(name="user_id", referencedColumnName = "id")},
			inverseJoinColumns = {@JoinColumn(name="role_id", referencedColumnName = "id")})
	private List <Role> roles;
	
	// 如下是一堆重写父类的方法。

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		List<GrantedAuthority> auths = new ArrayList<>();
		List<Role> roles = this.getRoles();
		for(Role role : roles)
		{
			for(Authority authority : role.getAuthorities())
			{
				
				auths.add(new SimpleGrantedAuthority(authority.getName()));
				//auths.add(new simple)
			}
		}
		return auths;
		//return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
		//return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
}
