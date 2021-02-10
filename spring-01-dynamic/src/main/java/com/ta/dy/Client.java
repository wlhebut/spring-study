package com.ta.dy;

import org.junit.Test;

public class Client {

    @Test
    public void test(){

        Rent rent = new Host();

        DynamicHandler dynamicHandler = new DynamicHandler();

        dynamicHandler.setRent(rent);

        Object proxy = dynamicHandler.getProxy();

       Rent rent1 = (Rent) proxy;
       rent1.rent();


    }
}
