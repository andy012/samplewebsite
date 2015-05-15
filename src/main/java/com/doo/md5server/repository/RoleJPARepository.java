package com.doo.md5server.repository;

import com.doo.md5server.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by lizhaoxin on 2/5/15.
 */
public interface RoleJPARepository extends JpaRepository<Role, Long> {

    public Role findById(final Long id);
    public List<Role> findByRole(Long role);
}
