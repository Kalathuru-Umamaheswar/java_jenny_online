package me.jenny.oopexercises;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void displayDetails(){
        System.out.println("Name :"+this.name);
        System.out.println("Age :"+this.age);
        System.out.println("Gender :"+this.gender);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
