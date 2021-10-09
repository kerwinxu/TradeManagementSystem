package tradeManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "order_process")
public class OrderProcess {
	// 如下是这个表本身的数据
	@Id
	@GeneratedValue
	private Integer id; // id

	@ManyToOne
	//@JoinColumn(name = "processStateId")
	private ProcessState processState; // 状态

	@Column(columnDefinition = "TEXT")
	private String text; //

}
