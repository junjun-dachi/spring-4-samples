package org.junjun.spring.tutorials.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("springUserDetailService")
public class UserDetailsServiceImpl implements UserDetailsService {

	private Map<String, String> users = new HashMap<>();

	public UserDetailsServiceImpl() {
		users.put("springuser", "springpassword");
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = null;
		if (users.keySet().contains(username)) {
			user = new User(username, users.get(username), getGrantedAuthorities(username));
		} else {
			throw new UsernameNotFoundException("username [" + username + "] not found");
		}
		return user;
	}

	private List<GrantedAuthority> getGrantedAuthorities(String username) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		// here ROLE_USER is hard coded , but system can load user role from DB
		// by user name and add to the list
		authorities.add(new SimpleGrantedAuthority("ROLE_WEB"));
		return authorities;
	}

}
