package com.afei.test;

import com.afei.spring_hibernate.entity.User;
import com.afei.spring_hibernate.service.IUserService;
import com.afei.spring_hibernate.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cxm on 2017/10/13.
 */
public class TestSpring {

    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml","classpath:spring-hibernate.xml"});
        IUserService userService = ac.getBean(UserService.class);
        userService.test();
        User user = new User();
        user.setName("xiao11");
        user.setPassword("xiao11");
        userService.save(user);
    }
}
