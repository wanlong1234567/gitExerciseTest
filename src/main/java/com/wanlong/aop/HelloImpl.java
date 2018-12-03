package com.wanlong.aop;


import com.google.inject.Singleton;
import com.google.inject.name.Named;

/**
 * @author wl
 * @date 2018/12/3
 *
 * hello接口的实现类
 */
@Singleton
public class HelloImpl implements Hello {
    /**
     * Guice中给某个方法添加拦截器是通过@Named注解来完成的，一个拦截器会绑定一个带xxx的@Named注解，
     * 当你这个对象时通过guice容器创建的，当你访问带xxx的@Named注解的时候，就会被拦截器拦截到
     */
    @Named("interceptor")
    public void sayHi() {
        System.out.println("hello brother");
    }

    @Named("log")
    public void doSomething() {
        System.out.println("再见了，兄弟们");
    }
}
