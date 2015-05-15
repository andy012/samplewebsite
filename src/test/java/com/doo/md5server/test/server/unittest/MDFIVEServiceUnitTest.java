package com.doo.md5server.test.server.unittest;

import com.doo.md5server.config.DataSourceConfig;
import com.doo.md5server.domain.MDFIVE;
import com.doo.md5server.domain.User;
import com.doo.md5server.service.MDFIVEService;
import com.doo.md5server.service.UserService;
import com.doo.md5server.test.config.DataSourceConfigTest;
import com.doo.md5server.test.config.MDFiveServiceConfig;
import com.doo.md5server.test.config.UserServiceConfig;
import com.doo.md5server.util.MyJspUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


/**
 * Created by Administrator on 15-5-1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DataSourceConfigTest.class, MDFiveServiceConfig.class, UserServiceConfig.class})
public class MDFIVEServiceUnitTest {

    @Autowired
    private MDFIVEService mdfiveService;
    @Autowired
    private UserService userService;
    @Test
    public void testMDFiveDelete(){

        User user=userService.findById(3L);
        MDFIVE mdfive=new MDFIVE();
        mdfive.setDetail("helloworld");
        mdfive.setFLAG(1);
        mdfive.setMd5("hello");
        mdfive.setUser(user);
        try {
            mdfiveService.addMDFIVE(mdfive);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("------");
        try {
            mdfiveService.deleteMDFIVE(mdfive.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testBase64(){
        System.out.println(MyJspUtil.bytes2String(Base64.encode(mdfiveService.findAllMDFIVE().get(0).getDetail().getBytes())));
    }


}
