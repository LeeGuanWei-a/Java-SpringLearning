package cn.com.spring.factory;

import cn.com.spring.dao.UserDao;
import cn.com.spring.dao.impl.UserDaoImpl;

//动态工厂实例化对象
public class DynamicFactory {

    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
