package me.jenny.oopexercises;

public class person1 {
    private String name;
    private long phoneNo;
    private int age;

    /*public person1(){
        System.out.println("Constructor inside person1 class");
    }*/
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }
    public long getPhoneNo(){
        return phoneNo;
    }
    public int getAge(){
        return age;
    }
    public void display(){
        System.out.println("Name :"+getName());
        System.out.println("Phone No :"+getPhoneNo());
        System.out.println("Age :"+getAge());
    }
}
