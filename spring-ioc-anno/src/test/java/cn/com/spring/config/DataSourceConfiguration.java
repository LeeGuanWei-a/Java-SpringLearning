package cn.com.spring.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

//<context:property-placeholder location="classpath:jdbc.properties"/>
@PropertySource("classpath:jdbc.properties")

public class DataSourceConfiguration {
    @Value("${jdbc.username}")
    private String user;

    @Bean("dataSource")     //Spring会将当前方法的返回值以指定名称存储到Spring容器中
    public DataSource getDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("${jdbc.driver}");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test1?serverTimezone=UTC");
        dataSource.setUser(user);
        dataSource.setPassword("root");
        return dataSource;
    }
}
