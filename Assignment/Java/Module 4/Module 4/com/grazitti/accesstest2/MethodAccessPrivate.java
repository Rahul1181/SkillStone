package com.grazitti.accesstest2;

public class MethodAccessPrivate {
    private int num5=5;
    private int num6=8;
    private int multiply(){
        return num5*num6;
    }
    public static void main(String [] args){
        MethodAccessPrivate multiplication=new MethodAccessPrivate();//Private can only be accessed only within class
        System.out.println(multiplication.multiply());
    }
}
