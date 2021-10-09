package tradeManagementSystem.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * 这个是系统管理员可以操作的东西
 * @author kerwin
 *
 */

public class SysAdminController {
	public SysAdminController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/admin/helloworld")
	public String helloworld()
	{
		return "hello world";
	}

}
