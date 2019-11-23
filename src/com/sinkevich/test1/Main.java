package com.sinkevich.test1;

import java.util.Scanner;

public class Main extends Object {
    public static void main(String[] args) {
//        Scanner se=new Scanner(System.in);
//            if (se.hasNext()) {
//                int a=se.nextInt();
//                System.out.println(a);
//        }
//        System.out.println("hello, world!");
//            Person a=new Person();
//            Person alexa=new Person("Alexa ");
//        System.out.println(alexa.toString());
//        System.out.println(a);
    Person Smith=new Person(40, "Smith");
    Smith.incrementAge();
    Smith.incrementGetAge(5);
    int age=Smith.incrementGetAge(5);
        System.out.println(age);
    }

}
