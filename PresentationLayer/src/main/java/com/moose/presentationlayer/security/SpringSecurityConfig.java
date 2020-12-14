package com.moose.presentationlayer.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		log.info("______now in global config");
		auth
			.inMemoryAuthentication()
			.withUser("admin").password("admin").roles("ADMIN", "USER")
			.and().withUser("user").password("user").roles("USER");
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception{
		
		auth
			.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles("USER", "ADMIN");
	}
	
	
	
	@Override
	public void configure(WebSecurity web) throws Exception{
		web.ignoring().antMatchers("/css/**", "/webjars/**");
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		log.info("______now in configure.");
		http.authorizeRequests().antMatchers("/index/**", "/categoryBooks/**", "/productView/**", "/checkout", "/doCheckout", "/checkUser").authenticated()
			
			.and().authorizeRequests().antMatchers("/login", "/logout").permitAll()
			.and().authorizeRequests().antMatchers("/static/css/**", "/js/**", "/images/**", "/**/favicon.ico").authenticated()
			.anyRequest().authenticated()
			.and().formLogin().loginPage("/login").defaultSuccessUrl("/main").permitAll()
			.and().logout()
					.deleteCookies("remove")
					.invalidateHttpSession(true)
					.logoutUrl("/logut")
					.logoutSuccessUrl("/logout-success")
					.logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
	}
}
