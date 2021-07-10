package cn.com.spring.service.impl;

import cn.com.spring.dao.UserDao;
import cn.com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

//<bean id="userService" class="cn.com.spring.service.impl.UserServiceImpl"></bean>

//@Component("userService")
@Repository("userService")

//@Scope("singleton")
//@Scope("prototype")
public class UserServiceImpl implements UserService {

    //@Value("com.mysql.cj.jdbc.Driver")           //普通属性注入
    @Value("${jdbc.driver}")
    private String driver;

    //<property name="userDao" ref="userDao"/>
    //@Autowired      //按照数据类型从Spring容器中进行匹配
    //@Qualifier("userDao")   //按照id值从容器中进行匹配，此时@Qualifier结合@Autowired使用
    @Resource(name = "userDao")     //相当于@Qualifier+@Autowired
    private UserDao userDao;

    /*xml方式*/
/*    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    @Override
    public void save() {
        System.out.println(driver);
        userDao.save();
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化...");
    }

    @PreDestroy
    public void destory(){
        System.out.println("销毁...");
    }
}
