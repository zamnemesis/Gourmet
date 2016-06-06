package tarasenko.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tarasenko.service.UserService;

/**
 * @author tarasenko
 * @since 01.06.2016
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("spring-config.xml");

        UserService userService = (UserService) appContext.getBean("userService");
        System.out.println(userService.getUser(1L).getLogin());
    }
}
