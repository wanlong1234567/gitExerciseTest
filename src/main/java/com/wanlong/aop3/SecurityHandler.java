package com.wanlong.aop3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wl
 * @date 2018/12/3
 */
public class SecurityHandler implements InvocationHandler{
    private Object targetObject;

    public Object createProxyInstance(Object targetObject){
        this.targetObject = targetObject;

        //创建一个代理对象，此对象是一个与目标对象实现了相同接口的对象，第一个参数为目标对象的类加载器，第二个参数为目标对象所实现的所有接口，第三个参数为实现了InvocationHandler接口的对象实例，这里是SecurityHandler本身
        return Proxy.newProxyInstance(this.targetObject.getClass().getClassLoader(), this.targetObject.getClass().getInterfaces(), this);
    }

    /**
     * InvocationHandler接口的方法
     * @param proxy 代理对象
     * @param method 被拦截到的方法
     * @param args 被拦截到的方法的输入参数
     * @return 代理对象最后又将拦截到的方法处理委派回给目标对象自己处理
     */
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {

        MyPersonServiceImpl bean = (MyPersonServiceImpl) this.targetObject;

        Object result = null;

        System.out.println("before advice()");
        result = method.invoke(bean, args);
        System.out.println("after advice()");
        System.out.println("参数个数: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("每一个具体的参数值: " + args[i]);
        }
        System.out.println(bean.myproperty);

        return result;
    }
}
