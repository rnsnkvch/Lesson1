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
//        Person Smith = new Person(40, "Smith", true);
//        Smith.incrementAge();
//        Smith.incrementGetAge(5);
//        int age = Smith.incrementGetAge(5);
//        System.out.println(Smith);
//        Smith.divorced();
//        System.out.println(Smith);
//        Smith.married();
//        System.out.println(Smith);
        Photographer Alex = new Photographer (50, "Alex", false );
        Alex.doPhoto();
        Alex.doPhoto();
        Alex.doPhoto();
        String photo = Alex.getPhoto();
        System.out.println(photo);
    }

}
