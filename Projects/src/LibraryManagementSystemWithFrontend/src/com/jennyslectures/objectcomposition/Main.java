package com.jennyslectures.objectcomposition;

public class Main {
    public static void main(String[] args) {
        Address address=new Address(134,"54G","Bengaluru","AP");

        Person person=new Person("jenny",address);
        person.displayPersonDetails();
    }
}
