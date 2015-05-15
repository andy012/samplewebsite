package com.doo.md5server.test.server.unittest;

import com.doo.md5server.domain.User;
import com.doo.md5server.service.UserService;
import com.doo.md5server.test.config.DataSourceConfigTest;
import com.doo.md5server.test.config.UserServiceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * Created by Administrator on 15-4-27.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DataSourceConfigTest.class, UserServiceConfig.class}, loader = AnnotationConfigContextLoader.class)
public class UserServiceUnitTest {
    @Autowired
    private UserService userJPAServiceImpl;
    @Test
    public void testSave(){
        User user=new User();
        user.setFirstName("andy");
        user.setLastName("doo");
        user.setUsername("andydoo@gmail.com");
        user.setPassword("11111111");
        user.setShortUsername("andydoo");
        try {
            userJPAServiceImpl.addUser(user);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
