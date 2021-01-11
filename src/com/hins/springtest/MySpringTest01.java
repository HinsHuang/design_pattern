package com.hins.springtest;


import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MySpringTest01 {

    public static void main(String[] args) {
        FileSystemXmlApplicationContext  applicationContext = new FileSystemXmlApplicationContext("E:\\idea_work\\tsl\\design_pattern\\src\\com\\hins\\springtest\\bean01.xml");
        Person person1 = (Person) applicationContext.getBean("person");
        System.out.println("person1:" + person1);
        Person person2 = (Person) applicationContext.getBean("person");
        System.out.println("person2:" + person2);
        System.out.println(person1 == person2);
    }

}
