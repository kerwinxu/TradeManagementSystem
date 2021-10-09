package tradeManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

// 货币单位表
@Entity
@Getter
@Setter
@Table(name = "currency_unit")
public class CurrencyUnit {
	
	@Id
	@GeneratedValue
	private Integer  id; // id
	
	@Column(length = 20)
	private String name;
}
