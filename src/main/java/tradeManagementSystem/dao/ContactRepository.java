package tradeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tradeManagementSystem.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
