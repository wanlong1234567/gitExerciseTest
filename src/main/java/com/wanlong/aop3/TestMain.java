package com.wanlong.aop3;

/**
 * @author wl
 * @date
 */
public class TestMain {
    public static void main(String[] args) {
        SecurityHandler myHandler = new SecurityHandler();
        MyPersonService mybz = (MyPersonService) myHandler.createProxyInstance(new MyPersonServiceImpl());
        mybz.findPerson("wl");
    }
}
