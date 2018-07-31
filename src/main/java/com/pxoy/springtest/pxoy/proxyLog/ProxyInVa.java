package com.pxoy.springtest.pxoy.proxyLog;

import com.pxoy.springtest.pxoy.service.CalculateService;
import com.pxoy.springtest.pxoy.service.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: yhy
 * @Date: 2018/7/31 17:13
 * @Version 1.0
 */
//代理类
public class ProxyInVa {

//    被代理的对象 如 CalculateService
    Object target;

    public ProxyInVa(Object target) {
        this.target = target;
    }

    public Object getInstance() {
        ClassLoader loader = target.getClass().getClassLoader();
        /*对应的接口类*/
        Class[] interfaces = new Class[]{UserService.class};
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("进行计算.......");
                System.out.println("------被代理对象的调用方法的名称-----"+method.getName());
                Object invoke = method.invoke(target, args);
                System.out.println(invoke);
                return invoke;
            }
        };
        Object proxy  = Proxy.newProxyInstance(loader,interfaces,handler);
        return proxy;
    }
}
