package com.wanlong.aop;

import com.google.inject.*;
import com.google.inject.matcher.Matchers;
import com.google.inject.name.Names;

/**
 * @author wl
 * @date 2018/12/3
 *
 * 测试程序
 */
public class Client {
    /**
     * 注入hello属性
     */
    @Inject
    private Hello hello;
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Module() {
            public void configure(Binder binder) {
                //Matchers 控制拦截器要拦截的范围，可以确定到某个package中，可以指定为某个class，可以指定为某个类的子类等等
                //下面我们用的是任何类Matchers.any()
                binder.bindInterceptor(Matchers.any(), Matchers.annotatedWith(Names.named("interceptor")), new MyInterceptor()) ;
                binder.bindInterceptor(Matchers.any(), Matchers.annotatedWith(Names.named("log")), new MyInterceptor()) ;
            }
        });
        //通过Guice来得到一个Hello实例，其实是指向的HelloImpl实例
        Hello hello = injector.getInstance(Hello.class) ;

        hello.sayHi() ;
        hello.doSomething();
    }
}
