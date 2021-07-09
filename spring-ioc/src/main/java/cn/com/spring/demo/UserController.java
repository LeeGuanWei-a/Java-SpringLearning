package cn.com.spring.demo;

import cn.com.spring.service.UserService;
import cn.com.spring.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //某个类型的对象(Bean)有多个时
        UserService userService = (UserService) app.getBean("userService");
        //某个类型的对象(Bean)只存在一个时
        UserService userService1 = app.getBean(UserService.class);

        userService.save();

/*        UserService userService = new UserServiceImpl();
        userService.save();*/

    }
}
