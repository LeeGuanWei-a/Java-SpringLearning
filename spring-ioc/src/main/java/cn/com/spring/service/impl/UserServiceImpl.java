package cn.com.spring.service.impl;

import cn.com.spring.dao.UserDao;
import cn.com.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    //构造方法注入
    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    //set()方法注入
/*    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

/*    @Override
    public void save() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
    }*/

    public void save() {
        userDao.save();
    }
}
