package tradeManagementSystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

// 介绍人的表，因为这个不常用，这个单独做一个表吧。
@Entity
@Getter
@Setter
@Table(name = "contact")
public class Introducer {
	
	@Id
	@GeneratedValue
	private Integer  id; // id
	
	@ManyToOne
	//@JoinColumn(name = "contactSourceId")
	private Contact source;  // 源头
	
	@ManyToOne
	//@JoinColumn(name = "contactDestId")
	private Contact dest;    // 目的。

}
