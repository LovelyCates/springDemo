package edu.hubu.spring6.bean;

/**
 * @author 小喵
 * @date 2024/4/18
 */
public class HelloWorld {

    /**
     * 反射机制调用无参构造方法
     */
    public HelloWorld() {

        System.out.println("调用无参构造方法？");

    }

    /**
     * 测试
     */
    public void sayHello() {
        System.out.println("Hello World Spring, I am back.");
    }


}
