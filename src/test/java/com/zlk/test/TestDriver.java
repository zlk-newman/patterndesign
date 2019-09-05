package com.zlk.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDriver {
    @Test
    public void test03() {
        // 获取spring容器上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 从spring容器中获取指定name或者id的java实体类对象；
        //Student student01 = context.getBean("student01", Student.class);
        Student student02 = context.getBean("student02", Student.class);
        //System.out.println(student01.toString());
        System.out.println(student02.toString());
    }

    @Test
    public void test02() {
        // 获取spring容器上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 从spring容器中获取指定name或者id的java实体类对象；
        Student student01 = context.getBean("student01", Student.class);
        // 再次获取
        Student student02 = context.getBean("student01", Student.class);

        System.out.println("student01 == student02:" + (student01 == student02));

        // 调用行为
        student01.doStuding();
    }

    @Test
    public void test01() {
        // 创建Studen类的实例对象
        Student student = new Student();
        // 调用行为方法
        student.doStuding();
    }

}
