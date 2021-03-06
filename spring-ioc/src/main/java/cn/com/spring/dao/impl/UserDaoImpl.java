package cn.com.spring.dao.impl;

import cn.com.spring.dao.UserDao;
import cn.com.spring.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {

    private List<String> stringList;
    private Map<String, User> userMap;
    private Properties properties;


    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private String userame;
    private int age;

    public void setUserame(String userame) {
        this.userame = userame;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*    public void init(){
        System.out.println("初始化方法");
    }

    public void destory(){
        System.out.println("销毁方法");
    }*/

    @Override
    public void save() {
        /*System.out.println("username" + userame + "age" + age);*/

        System.out.println(stringList);
        System.out.println(userMap);
        System.out.println(properties);

        System.out.println("save running......");
    }
}
