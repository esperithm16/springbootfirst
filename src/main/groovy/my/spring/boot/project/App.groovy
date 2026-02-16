package my.spring.boot.project

import my.spring.boot.project.bean.UserConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

@SpringBootApplication
class App {

    static void main(String[] args) {

        // Load XML Context
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml")

        UserConfig config = (UserConfig) context.getBean("userConfigBean")

        println(config.getName())
        println(config.getClassName())
    }
}
