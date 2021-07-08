package cn.com.spring.factory;

import cn.com.spring.dao.UserDao;
import cn.com.spring.dao.impl.UserDaoImpl;


//静态工厂实例化对象
public class StaticFactory {

    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
