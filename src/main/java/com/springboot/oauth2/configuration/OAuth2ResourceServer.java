package com.springboot.oauth2.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
@EnableResourceServer
public class OAuth2ResourceServer extends ResourceServerConfigurerAdapter {
	
	@Override
	public void configure(HttpSecurity security) throws Exception {
		security.authorizeRequests().antMatchers("/api/**").authenticated().antMatchers("/").permitAll();
	}

}
/** Above config enable protection on all endpoints starting /api. All other endpoints can be accessed freely.**/