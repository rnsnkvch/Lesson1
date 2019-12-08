package com.sinkevich.test1;

import java.util.ArrayList;
import java.util.List;
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
        Photographer Alex = new Photographer(50, "Alex", true);
//        Alex.
        if (Alex.isMarriage() && Alex.getAge()>0){
        Alex.doPhoto();
        Alex.doPhoto();
        Alex.doPhoto();}
        String photo = Alex.getPhoto();
        System.out.println(photo + " from Alex");
        VideoMaker Mark = new VideoMaker(30, "Mark", true);
        Mark.doVideo();
        Mark.doVideo();
        String video = Mark.getVideo();
        System.out.println(video);
        Photo photo1 = new MultiMakerImpl();
        Photo photo2 = new Photographer("Test");
        List<Photo> photoList = new ArrayList<Photo>();
        photoList.add(photo1);
        photoList.add(photo2);
        for (int i = 0; i <= photoList.size() - 1; i++) {
            System.out.println(photoList.get(i));
            Photo currentPhoto = photoList.get(i);
            currentPhoto.doPhoto();
            System.out.println(currentPhoto.getPhoto());
            var current = photoList.get(i);
        }
        for (Photo currentPhoto : photoList) {
            currentPhoto.doPhoto();
            System.out.println(currentPhoto.getPhoto());
        }
        photoList.forEach(new MyConsumer());
//            int[] array = new int []{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            for (int a = 0; a < 10; a++){
//                System.out.println(array[a]);
//
            }

    }



//for() - написать цикл который
//выводит все числа
//собрать  сумму этих чисел
//вывести чиселку-сумму
//вывести каждое 2-ое число
//вевести четные числа (проверить на четность: x % 2 == 0)