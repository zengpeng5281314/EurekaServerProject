package com.zengpeng.eureka.erukaserviceproject;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) {

		try {
			http.csrf().disable().authorizeRequests().antMatchers("/actuator/**").permitAll().anyRequest()
					.authenticated().and().httpBasic();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
