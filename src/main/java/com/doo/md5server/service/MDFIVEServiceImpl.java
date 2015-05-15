package com.doo.md5server.service;

import com.doo.md5server.domain.MDFIVE;
import com.doo.md5server.domain.User;
import com.doo.md5server.repository.MDFiveJPARepository;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.annotations.NamedNativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by Administrator on 15-4-27.
 */
@Service
@Transactional
public class MDFIVEServiceImpl implements MDFIVEService{
    @Autowired
    private MDFiveJPARepository mdFiveJPARepository;

    @Override
    public List<MDFIVE> findAllMDFIVE() throws HibernateException, RuntimeException {
        return mdFiveJPARepository.findAll();
    }

    @Override
    public MDFIVE addMDFIVE(@Valid MDFIVE mdfive) throws ConstraintViolationException, Exception {
        return mdFiveJPARepository.save(mdfive);
    }


    @Override
    public void deleteMDFIVE(@Valid Long id) throws ConstraintViolationException, Exception {

        mdFiveJPARepository.delete(mdFiveJPARepository.findOne(id));
    }

    @Override
    public void deleteMDFIVE(@Valid MDFIVE mdfive) throws ConstraintViolationException, Exception { 

                mdFiveJPARepository.delete(mdfive);
    }

    @Override
    public List<MDFIVE> findByUser(User user) throws ConstraintViolationException, Exception {
        //Sort s=new Sort(Sort.Direction.DESC, "ID");
        return mdFiveJPARepository.findByUser(user);
    }
}
