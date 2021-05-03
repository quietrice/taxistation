package common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationDataSource {

    @Autowired
    private Environment environment;

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(environment.getRequiredProperty("spring.datasource.driverClassName"));
        dataSourceBuilder.url(environment.getRequiredProperty("spring.datasource.url"));
        dataSourceBuilder.username(environment.getRequiredProperty("spring.datasource.username"));
        dataSourceBuilder.password(environment.getRequiredProperty("spring.datasource.password"));
        return dataSourceBuilder.build();
    }
}