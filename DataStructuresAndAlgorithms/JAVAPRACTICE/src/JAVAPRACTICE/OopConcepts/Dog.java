package JAVAPRACTICE.OopConcepts;

public class Dog {
    private String name;
    private int height;
    private int weight;
    public void bark(){
        System.out.println("Woof");
    }

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setHeight(int h){
        if(h>10) {
            height = h;
        }
    }
    public int getHeight(){
        return height;
    }
    public void setWeight(int w){
        weight=w;
    }
    public int getWeight(){
        return weight;
    }
}
