package com.sinkevich.test1;

public class Test {
    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int c : test) {
            if (c % 2 == 0) {
                sum = sum + c;
                System.out.println(sum);
            } else if (c % 3 == 0) {
                System.out.println("c = " + c);
            } else {
                System.out.println("bad C");
            }
        }
        System.out.println(sum);
    }
    //   int[] test1 = new int []{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    //   if ( test1 %12 == 0){

}


