package JAVAPRACTICE.OopConcepts;

public class DogMain {
    public static void main(String[] args) {
        Dog obj=new Dog();
        //obj.height=6;
        //obj.weight=56;
        //obj.bark();
        obj.setName("puppy");
        System.out.println(obj.getName());
        obj.setHeight(8);
        System.out.println(obj.getHeight());
        obj.setWeight(56);
        System.out.println(obj.getWeight());
    }
}
