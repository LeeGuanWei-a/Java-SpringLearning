package cn.com.spring.service.impl;

import cn.com.spring.dao.UserDao;
import cn.com.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
    }
}
