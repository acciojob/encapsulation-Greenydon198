package com.driver;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RWOnly ob = new RWOnly("Greeny");
        ob.setS("GREENY");
        System.out.println(ob.getS());
    }
  
}