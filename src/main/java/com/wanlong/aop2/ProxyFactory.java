package com.wanlong.aop2;

import com.wanlong.aop.MyInterceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wl
 * @date 2018/12/3
 */
public class ProxyFactory implements InvocationHandler {

    private Object stu;

    /**
     * 创建目标对象的实体类
     *
     * @param stu 目标对象
     * @return 目标对象实体类
     */
    public Object createStudentProxy(Object stu) {
        this.stu = stu;
        //返回目标对象实体类，第一个参数目标对象的类加载器，第二个参数是目标对象的接口对象，
        // 第三个参数是InvocationHandler默认对象。此方法会回调invoke方法
        return Proxy.newProxyInstance(MyInterceptor.class.getClassLoader(), new Class<?>[]{StudentInterface.class}, new ProxyFactory());
        //  return Proxy.newProxyInstance(stu.getClass().getClassLoader(),stu.getClass().getInterfaces(),this);
        //这2个都是可以的
    }

    /**
     * 处理业务逻辑：
     * 当Student存在名字则直接打印“Hello World”
     * 将如Student的名称为空，则输出相关的信息。如“名称为空，代理类已经拦截”等，
     * 表明代理类已经起作用了。
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        StudentBean s = (StudentBean) stu;
        Object object = null;
        if (s.getName() != null) {
            object = method.invoke(stu, args);
        } else {
            System.out.println("名称为空，代理类已经拦截");
        }
        return object;
    }

}
