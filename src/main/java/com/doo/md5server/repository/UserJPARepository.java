package com.doo.md5server.repository;

import com.doo.md5server.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lizhaoxin on 2/5/15.
 */
public interface UserJPARepository extends JpaRepository<User, Long>{

    public User findByUserName(String userName);

}
