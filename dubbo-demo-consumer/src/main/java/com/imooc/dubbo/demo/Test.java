package com.imooc.dubbo.demo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-consumer.xml"});
        context.start();

        UserService userService = (UserService) context.getBean("userService");

        for (int i = 0; i < 20; i++) {
//            System.out.println(userService.findOne(i));
            System.out.println(userService.saveOne());
        }
    }
}
