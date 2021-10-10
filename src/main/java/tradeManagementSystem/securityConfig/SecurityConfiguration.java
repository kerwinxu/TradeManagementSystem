package tradeManagementSystem.securityConfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import tradeManagementSystem.service.UserDetailsServiceImpl;


@Configurable
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	// 这个就是返回用户信息的。
	@Override
	protected UserDetailsService userDetailsService() {
		// TODO Auto-generated method stub
		return new  UserDetailsServiceImpl();
	}
	
	/**
	 * 静态资源设置
	 */
	@Override
    public void configure(WebSecurity webSecurity) {
        //不拦截静态资源,所有用户均可访问的资源
		// 这里我准备做vue的目录，以后再修改。
        webSecurity.ignoring().antMatchers(
                "/",
                "/css/**",
                "/js/**",
                "/images/**",
                "/layui/**"
                );
    }
	/**
	 * http请求设置
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
		// 这个是权限链条中的一环。
		http.csrf() // 跨站
	    .disable() // 关闭跨站检测
		.authorizeRequests()
		.antMatchers("/admin/**").hasRole("admin")  // 只有超级管理员才能访问这个目录内的
		.antMatchers("/user/**/add").hasAnyRole("user", "admin")  // 增加操作
		.antMatchers("/user/**/select").hasAnyRole("user", "admin", "guest", "sys_guest") // 查询操作
		.antMatchers("/user/**/update").hasAnyRole("user", "admin")  // 更新操作。
		.and()
		.formLogin();
	}
	
	 @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        // 使用自定义的 UserDetailService
	        auth.userDetailsService(userDetailsService()).passwordEncoder(new BCryptPasswordEncoder());
	    }

}
