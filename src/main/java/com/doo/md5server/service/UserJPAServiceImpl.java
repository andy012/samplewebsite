package com.doo.md5server.service;

import com.doo.md5server.domain.User;
import com.doo.md5server.repository.UserJPARepository;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by lizhaoxin and andydoo on 2/6/15.
 */
@Service
@Transactional
public class UserJPAServiceImpl implements UserService {

    private static final Logger logger = Logger.getLogger(UserJPAServiceImpl.class);

    @Autowired private UserJPARepository userJPARepository;

    @Override
    public Boolean addUser(@Valid User user) throws ConstraintViolationException, Exception {
        try {
            userJPARepository.save(user);
            return true;
        } catch (Exception e) {
            logger.error(e);
            throw new Exception(e);
        }
    }

    @Override
    public Boolean updateUser(@Valid User user) throws ConstraintViolationException, Exception {
        try {
            userJPARepository.save(user);
            return true;
        } catch (Exception e) {
            logger.error(e);
            throw new Exception(e);
        }
    }

    @Override
    public Boolean deleteUser(@Valid User user) throws Exception {
        try {
            userJPARepository.delete(user);
            return true;
        } catch (Exception e) {
            logger.error(e);
            throw new Exception(e);
        }
    }

    public Boolean deleteUser(@Valid Long id) throws Exception {
        try {
            userJPARepository.delete(id);
            return true;
        } catch (Exception e) {
            logger.error(e);
            throw new Exception(e);
        }
    }
    @Override
    public User findByUsername(String username) throws HibernateException, RuntimeException {

        return userJPARepository.findByUserName(username);
    }

    @Override
    public User findById(Long id) throws HibernateException, RuntimeException {
        return userJPARepository.findOne(id);
    }

    @Override
    public List<User> findUsersByRole(Long role) throws HibernateException, RuntimeException {

        return null;
    }



    @Override
    public List<User> findAllUsers() throws HibernateException, RuntimeException {
        return null;//userJPARepository.findAll(new PageRequest());
    }
}
