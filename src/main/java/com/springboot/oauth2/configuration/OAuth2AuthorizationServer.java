package com.springboot.oauth2.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

@SuppressWarnings("deprecation")
@Configuration
@EnableAuthorizationServer
public class OAuth2AuthorizationServer extends AuthorizationServerConfigurerAdapter {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public void configure(AuthorizationServerSecurityConfigurer security) {

		security.tokenKeyAccess("permitAll()").checkTokenAccess("isAuthenticated()")
				.allowFormAuthenticationForClients();

	}

	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {

		clients.inMemory().withClient("clientApp").secret(passwordEncoder.encode("123456"))
				.authorizedGrantTypes("password", "authorization_code", "refresh_token").authorities("READ_ONLY_CLIENT")
				.scopes("read_profile_info").resourceIds("oauth-resource").redirectUris("http://localhost:8081/login")
				.accessTokenValiditySeconds(120).refreshTokenValiditySeconds(240000);
	}

}
