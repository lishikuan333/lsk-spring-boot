package com.lsk.spring.boot.autoconfigure;


/**
 * @Author: 李世宽
 * @Email: 18135757181@163.com
 * @Date: 2020/5/16 22:22
 */
public class HelloService {
    private static final String LSK_FULL_NAME = "LSK FULL NAME";


    private HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHello() {
        System.out.println("LSK_FULL_NAME IS " + helloProperties.getPrefix() + " " + helloProperties.getSuffix());

        System.out.println("sayHello SUCCESS");

        return "LSK_FULL_NAME IS " + helloProperties.getPrefix() + " " + helloProperties.getSuffix();
    }

}
