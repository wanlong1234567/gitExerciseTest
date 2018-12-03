package com.wanlong.aop3;

/**
 * @author wl
 * @date
 */
public class MyPersonServiceImpl implements MyPersonService {

    public String myproperty = "wl...";

    public void findPerson(String name) {
        System.out.println("在com.wanlong.aop3.MyPersonServiceImpl.findPerson()中: " + name);
    }
}
