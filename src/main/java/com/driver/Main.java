package com.driver;

public class Main {

    public static void Main(String args[])
    {
        RWOnly obj = new RWOnly();

        obj.setName("Shakthi");

        String name = obj.getName();
        System.out.println(name);
    }
  
}