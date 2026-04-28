package me.jenny.oopexercises;

public class PersonMain {
    public static void main(String[] args) {
        Person obj=new Person("Mahesh",21,"Male");
        obj.displayDetails();
        System.out.println();
        Person obj1=new Person("Rahul",20,"Male");
        obj1.displayDetails();
       /* System.out.println("Name :"+obj.getName());
        System.out.println("Age :"+obj.getAge());
        System.out.println("gender :"+obj.getGender()); */
    }
}
