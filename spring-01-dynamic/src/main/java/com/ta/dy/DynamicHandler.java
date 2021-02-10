package com.ta.dy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类，自动生成代理类
public class DynamicHandler  implements InvocationHandler {


    private Rent rent;

    public void setRent(Rent rent){
        this.rent = rent;
    }

//    生成得到代理类
    public Object getProxy(){
        Object o = Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces() , this);
        return o;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        动态代理的本质
        Object invoke = method.invoke(rent, args);

        return invoke;

    }
}
