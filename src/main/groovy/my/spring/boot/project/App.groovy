package my.spring.boot.project

import my.spring.boot.project.bean.UserConfig
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext


@SpringBootApplication
class App {
    static void main(String[] args) {

        UserConfig user = new UserConfig();
        user.setName("John Doe");   // 👈 IMPORTANT

        SpringApplication.run(App, args)
    }
}
