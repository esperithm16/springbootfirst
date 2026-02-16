package my.spring.boot.project

import my.spring.boot.project.bean.UserConfig
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

@SpringBootApplication
class App {

    static void main(String[] args) {

        // Spring Boot context
        SpringApplication.run(App.class, args)

        // XML context (same as screenshot)
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml")

        UserConfig config = (UserConfig) context.getBean("userConfigBean")


    }
}
