package com.doo.md5server.service;

import com.doo.md5server.domain.Role;
import org.hibernate.HibernateException;

import javax.validation.Valid;
import java.util.List;

public interface RoleService {

	public Boolean addRole(@Valid final Role role) 		throws Exception;
	public Boolean updateRole(@Valid final Role role) 	throws Exception;
	public Boolean deleteRole(@Valid final Role role) 	throws Exception;
	
	public Role findById(final Long id) 				throws HibernateException, RuntimeException;
	public List<Role> findByRole(final Long role) 		throws HibernateException, RuntimeException;
	public List<Role> findAllRoles() 					throws HibernateException, RuntimeException;
}
