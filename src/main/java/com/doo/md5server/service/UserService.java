package com.doo.md5server.service;

import com.doo.md5server.domain.User;
import org.hibernate.HibernateException;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.List;

public interface UserService {

	public Boolean addUser(@Valid final User user) 		throws ConstraintViolationException, Exception;
	public Boolean updateUser(@Valid final User user) 	throws ConstraintViolationException, Exception;
	public Boolean deleteUser(@Valid final User user) 	throws Exception;
	public User findByUsername(final String username) 	throws HibernateException, RuntimeException;
	public User findById(final Long id) 				throws HibernateException, RuntimeException;
	public List<User> findUsersByRole(final Long role) 	throws HibernateException, RuntimeException;
	public List<User> findAllUsers() 					throws HibernateException, RuntimeException;
}
