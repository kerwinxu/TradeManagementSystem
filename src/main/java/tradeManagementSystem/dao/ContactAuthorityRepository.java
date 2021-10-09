package tradeManagementSystem.dao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import tradeManagementSystem.model.Contact;
import tradeManagementSystem.model.ContactAuthority;

/**
 * 
 * @author kerwin
 *
 */
public interface ContactAuthorityRepository extends JpaRepository<ContactAuthority, Integer> {
	
	// 返回某个联系人权限分为内所有的联系人列表
	Page<ContactAuthority>findContactAuthoritiesByContact(Contact contact, Pageable pageable);

}
