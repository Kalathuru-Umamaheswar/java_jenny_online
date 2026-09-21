package me.jenny.oopexercises;

public class Student {
    private String name;
    private String regNo;
    private float marks;
    private String address;
    private long phoneNo;

    public void setName(String name){
        this.name=name;
    }
    public void setMarks(float marks){
        this.marks=marks;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setPhoneNo(long phoneNo){
        this.phoneNo=phoneNo;
    }
    public String getName() {
        return name;
    }

    public String getRegNo() {
        return regNo;
    }

    public float getMarks() {
        return marks;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNo() {
        return phoneNo;
    }
    public Student(String name,String regNo,float marks){
        this.name=name;
        this.regNo=regNo;
        this.marks=marks;
    }
    public Student(String name,String regNo,float marks,String address,long phoneNo){
        this.name=name;
        this.regNo=regNo;
        this.marks=marks;
        this.address=address;
        this.phoneNo=phoneNo;
    }
    public void displayDetails(){
        System.out.println("Name :"+this.name);
        System.out.println("regNo :"+this.regNo);
        System.out.println("Maarks :"+this.marks);
        System.out.println("Address :"+this.address);
        System.out.println("Phone NO :"+this.phoneNo);
    }
}
