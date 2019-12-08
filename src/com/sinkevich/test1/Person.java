package com.sinkevich.test1;

public class Person {
    private String userName;
    private int age;
    private boolean marriage;
//  public Person (){
//        userName="";
//        age=0;
//        marriage=false;
//    }
    public Person (String userName) {
        this.userName=userName;
        this.age=0;
    }
    public Person (int age, String userName, boolean m) {
        this.userName=userName;
        this.age=age;
        this.marriage=m;
    }
    public Person (int age){
        this.age=age;
        userName="";
    }
@Override
    public String toString() {
    var w = userName + " " + age + " " + marriage;
    return w;
    }
    public String getUserName() {
        return userName;
    }
    public void incrementAge() {
        age=age+1;
    }
    public int incrementGetAge(int inc) {
        age=age+inc;
        return age;
    }
    public void married (){
        marriage=true;
    }
    public void divorced (){
        marriage=false;
    }
    public boolean isMarriage() {
        return marriage;
    }
    public int getAge (){
        return age;
    }
}
