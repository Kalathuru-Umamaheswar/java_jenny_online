package com.jennylectures.oopconcepts;

public class Dog {
    private String name;
    int height;
    int weight;
    void display(){
        System.out.println(name+" "+height+" "+weight);
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    /*String name;
    int height;
    int weight;
    void display(){
        System.out.println(name+" "+height+" "+weight+" ");
    }*/

    /*private String name;
    private int height;
    private int weight;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setHeight(int h){
        if(h>10){
           height=h;
        }
    }
    public void setWeight(int w){
        weight=w;
    }
    public int getHeight(){
        return height;
    }
    public int getWeight(){
        return weight;
    }
    void bark(){
        System.out.println("woof");
    }*/

}
