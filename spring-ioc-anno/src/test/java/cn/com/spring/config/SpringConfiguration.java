package cn.com.spring.config;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

//标志该类是Spring的核心配置类
@Configuration

//<context:component-scan base-package="cn.com.spring"/>
@ComponentScan("cn.com.spring")

//<context:property-placeholder location="classpath:jdbc.properties"/>
//@PropertySource("classpath:jdbc.properties")

//<import resource=""/>
@Import(DataSourceConfiguration.class)
public class SpringConfiguration {

/*    @Value("${jdbc.username}")
    private String user;

    @Bean("dataSource")     //Spring会将当前方法的返回值以指定名称存储到Spring容器中
    public DataSource getDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("${jdbc.driver}");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test1?serverTimezone=UTC");
        dataSource.setUser(user);
        dataSource.setPassword("root");
        return dataSource;
    }*/

}
