package com.doo.md5server.repository;

/**
 * Created by Administrator on 15-4-27.
 */

import com.doo.md5server.domain.MDFIVE;
import com.doo.md5server.domain.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MDFiveJPARepository extends JpaRepository<MDFIVE,Long> {

    List<MDFIVE> findByUser(User user);
}
