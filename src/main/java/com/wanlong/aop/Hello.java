package com.wanlong.aop;


import com.google.inject.ImplementedBy;

@ImplementedBy(HelloImpl.class)
public interface Hello {
    void sayHi();
    void doSomething();
}
