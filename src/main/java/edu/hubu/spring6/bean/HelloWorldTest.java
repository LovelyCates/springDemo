package edu.hubu.spring6.bean;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring 测试类
 * @author 小喵
 * @date 2024/4/18
 */
public class HelloWorldTest {

    /**
     * 使用日志
     */
    private Logger logger = LoggerFactory.getLogger(HelloWorldTest.class);

    @Test
    public void testHelloWorld() {

        // 根据上下文读取bean
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

        // bean 对象放在spring容器中，在spring源码底层就是一个Map集合，存储bean的map在 DefaultListableBeanFactory
        // TODO: 1. 根据ID获取
        // HelloWorld helloWorld = ac.getBean("helloWorld", HelloWorld.class);
        // TODO：2. 根据类型获取
        HelloWorld helloWorld = ac.getBean(HelloWorld.class);
        // spring 容器加载到Bean类时，会把这个类的描述信息，以包名 + 类名的方式存到 BeanDefinitionMap
        helloWorld.sayHello();
        logger.info("执行成功");

    }



    @Test
    public void testDIBySet(){

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student studentOne = ac.getBean("studentOne", Student.class);
        logger.warn(studentOne.toString());
    }

    @Test
    public void  testDIByConstructor() {

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student studentTwo = ac.getBean("studentTwo", Student.class);
        logger.warn(studentTwo.toString());

    }

    @Test
    public void  testDIBySetter() {

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student studentTwo = ac.getBean("studentThird", Student.class);
        logger.warn(studentTwo.toString());

    }



}
