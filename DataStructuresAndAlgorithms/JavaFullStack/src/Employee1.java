public class Employee1 {
    private String name;
    private int age;
    public void setter(int na,String a){
        this.age=na;
        this.name=a;
    }
    public String getter(){
        return name + " and age is "+age;
    }
    public static void main(String[] args) {
        Employee1 obj=new Employee1();
        obj.setter(18,"raju");
        System.out.println(obj.getter());
    }
}
