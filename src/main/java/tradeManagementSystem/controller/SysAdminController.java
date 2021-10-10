package tradeManagementSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这个是系统管理员可以操作的东西
 * @author kerwin
 *
 */

@RestController
public class SysAdminController {
	
	@RequestMapping("/admin/helloworld")
	public String helloworld()
	{
		return "hello world";
	}

}
