package com.doo.md5server.service;

import com.doo.md5server.repository.UserJPARepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class RepositoryBasedUserDetailsService implements UserDetailsService {
	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(RepositoryBasedUserDetailsService.class);
	
	@Autowired private UserJPARepository userRepo;
	 
	/**
	* Returns a populated {@link org.springframework.security.core.userdetails.UserDetails} object.
	* The username is first retrieved from the database and then mapped to
	* a {@link org.springframework.security.core.userdetails.UserDetails} object.
	*/
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try {
			com.doo.md5server.domain.User domainUser = userRepo.findByUserName(username);
			boolean enabled = true;
			boolean accountNonExpired = true;
			boolean credentialsNonExpired = true;
			boolean accountNonLocked = true;
			return new User(
							domainUser.getUsername(),
							domainUser.getPassword(),
							enabled,
							accountNonExpired,
							credentialsNonExpired,
							accountNonLocked,
							getAuthorities(domainUser.getRole().getRole()));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	/**
	* Retrieves a collection of {@link org.springframework.security.core.GrantedAuthority} based on a numerical role
	* @param role the numerical role
	* @return a collection of {@link org.springframework.security.core.GrantedAuthority
	*/
	public Collection<? extends GrantedAuthority> getAuthorities(Long role) {
		return getGrantedAuthorities(getRoles(role));
	}
	/**
	* Converts a numerical role to an equivalent list of roles
	* @param role the numerical role
	* @return list of roles as as a list of {@link String}
	*/
	public List<String> getRoles(Long role) {
		List<String> roles = new ArrayList<String>();
		if (role.equals(1L)) {
			roles.add("ROLE_USER");
			roles.add("ROLE_ADMIN");
		} else if (role.equals(2L)) {
			roles.add("ROLE_USER");
		}
		return roles;
	}
	/**
	* Wraps {@link String} roles to {@link org.springframework.security.core.authority.SimpleGrantedAuthority} objects
	* @param roles {@link String} of roles
	* @return list of granted authorities
	*/
	public static List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (String role : roles) {
			authorities.add(new SimpleGrantedAuthority(role));
		}
		return authorities;
	}
}