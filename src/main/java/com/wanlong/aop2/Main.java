package com.wanlong.aop2;

/**
 * 利用Proxy实现AOP功能的总结如下：
   目标对象必须实现接口
   返回创建的代理对象
   重写接口的invoke()方法
  限制条件放在invoke()方法中
 *
 * @author wl
 * @date 2018/12/3
 */
public class Main {
    public static void main(String[] args) {
       // StudentInterface s1=new StudentBean();  //空
        StudentInterface s1=new StudentBean("wan");
        ProxyFactory factory=new ProxyFactory();
        StudentInterface s2= (StudentInterface) factory.createStudentProxy(s1);
        s2.print();

    }
}
