package com.jennylectures.oopconcepts;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog obj=new Dog();
        //obj.name="jerry";
        obj.setName("Tarun");
        System.out.println(obj.getName());
        obj.height=23;
        obj.weight=34;
        obj.display();

        //Dog obj=new Dog();
//        obj.name="Cherry";
//        obj.weight=34;
//        obj.height=23;
//        obj.display();

        /*Dog obj = new Dog();
        Dog obj1=new Dog();

        obj.setName("Umesh");
        obj.setWeight(34);
        obj.setHeight(-23);
        System.out.println(obj.getName());
        System.out.println(obj.getHeight());
        System.out.println(obj.getWeight());

        obj1.setWeight(35);
        System.out.println(obj1.getWeight()); */
    }
}

