package com.doo.md5server.service;

import com.doo.md5server.domain.MDFIVE;
import com.doo.md5server.domain.User;
import org.hibernate.HibernateException;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by Administrator on 15-4-27.
 */
public interface MDFIVEService {
    public List<MDFIVE> findAllMDFIVE() 					throws HibernateException, RuntimeException;
    public MDFIVE addMDFIVE(@Valid final MDFIVE mdfive) 		throws ConstraintViolationException, Exception;
    public void deleteMDFIVE(@Valid final Long id) 		throws ConstraintViolationException, Exception;
    public void deleteMDFIVE(@Valid final MDFIVE mdfive) 		throws ConstraintViolationException, Exception;

    public List<MDFIVE> findByUser(User user)throws ConstraintViolationException, Exception;
}
