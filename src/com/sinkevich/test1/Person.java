package com.sinkevich.test1;

public class Person {
    private String userName;
    private int age;
    public Person (){
        userName="";
        age=0;
    }
    public Person (String userName) {
        this.userName=userName;
        this.age=0;
    }
    public Person (int age, String userName) {
        this.userName=userName;
        this.age=age;
    }
    public Person (int age){
        this.age=age;
        userName="";
    }
@Override
    public String toString() {
    var w = userName + age;
    return w;
    }
    public void incrementAge() {
        age=age+1;
    }
    public int incrementGetAge(int inc) {
        age=age+inc;
        return age;
    }
}
