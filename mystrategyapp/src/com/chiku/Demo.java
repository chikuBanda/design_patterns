package com.chiku;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Animal lion = context.getBean("lion", Animal.class);
        Animal cheetah = context.getBean("cheetah", Animal.class);

        System.out.println("lion: \n" + lion.doRoar() + "\n" + lion.doHunt() + "\n\n");
        System.out.println("cheetah: \n" + cheetah.doRoar() + "\n" + cheetah.doHunt());
    }
}
