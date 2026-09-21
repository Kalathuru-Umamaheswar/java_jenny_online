package com.jennyslectures.objectcomposition;

public class Person {
    String name;
    Address address;

    public Person(String name,Address address){
        this.name=name;
        this.address=address;
    }

    void displayPersonDetails(){
        System.out.println("Name :"+name+"\nAddress :"+address);
    }
}
