package com.wanlong.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Map;

/**
 * @author wl
 * @date 2018/12/3
 *
 * 创建一个拦截器
 */
public class MyInterceptor implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        doBefore();
        /**
         * 真正要去执行的方法
         *
         * 可以在这里做一些验证，比如能否去执行这个方法
         */
        Object ret = invocation.proceed();
        System.out.println("ret:"+ret);
        System.out.println("类的信息："+invocation.getMethod().getDeclaringClass());
        System.out.println("方法名:"+invocation.getMethod().getName());
        System.out.println("参数 ：" + invocation.getArguments() );
        Map<String,Integer> map = (Map<String, Integer>) ret;
        System.out.println("map:"+map);
        doAfter();
        return ret;
    }

    /**
     * 在执行真正的逻辑之前执行
     */
    public void doBefore(){
        System.out.println("在方法之前做的事情");
    }
    /**
     * 在执行真正的逻辑之后执行
     */
    public void doAfter(){
        System.out.println("在方法之后做的事情");
    }
}
