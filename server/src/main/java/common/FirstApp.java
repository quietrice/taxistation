package common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories("repositoryes")
@ComponentScan("conrollers")
@ComponentScan("services")
@EntityScan("entities")
public class FirstApp {
    public static void main(String[] args){
        //SpringApplication.run(FirstApp.class, args);
        ApplicationContext applicationContext =
                SpringApplication.run(FirstApp.class, args);

    }
}
