package tradeManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

// 数量单位表
@Entity
@Setter
@Getter
@Table(name = "quantity_unit")
public class QuantityUnit {
	
	@Id
	@GeneratedValue
	private Integer  id; // id
	
	@Column(length = 20)
	private String name;

}
