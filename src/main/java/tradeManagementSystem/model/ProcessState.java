package tradeManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * 进展状态表
 * @author kerwin
 *
 */
@Entity
@Getter
@Setter
@Table(name = "process_state")
public class ProcessState {

	// 如下是这个表本身的数据
		@Id
		@GeneratedValue
		private Integer  id; // id
		
		@Column(length = 100)
		private String name;  // 这个是角色名称
}
