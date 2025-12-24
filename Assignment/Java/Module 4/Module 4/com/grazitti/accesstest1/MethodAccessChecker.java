///1. Create a package accesstest1 and accesstest2 under com.grazitti and create four classes on your own to explain the default,
//// public, private and protected access specifiers
package com.grazitti.accesstest1;

import com.grazitti.accesstest2.MethodAccessDefault2;
import com.grazitti.accesstest2.MethodAccessPublic;
import com.grazitti.accesstest2.MethodAccessProtected2;
import com.grazitti.accesstest2.MethodAccessPrivate;


public class MethodAccessChecker{
    public static void main(String[] args){
        MethodAccessDefault1 mdefault1=new MethodAccessDefault1();
        System.out.println("Default specifier (addition) can be accessed within same package: "+mdefault1.add());

        MethodAccessDefault2 mdefault2=new MethodAccessDefault2();
        System.out.println("Default specifier (addition): "+mdefault2.add()); //Outside package

        MethodAccessPublic mpublic=new MethodAccessPublic();
        System.out.println("Public specifier (subtraction): "+mpublic.subtract());

        MethodAccessProtected1 mprotected1=new MethodAccessProtected1();
        System.out.println("Protected speciifier (division) can be accessed within same package: "+mprotected1.division());

        MethodAccessProtected2 mprotected2=new MethodAccessProtected2();
        System.out.println("Protected specifier (division): "+mprotected2.division());// Outside package

        MethodAccessPrivate mprivate=new MethodAccessPrivate();
        System.out.println(mprivate.multiply()); //Show error because it can't be accessed outside package or class



    }
}
