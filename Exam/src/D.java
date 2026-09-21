interface A {
    void show();
}
interface B extends A {
    void displayB();
}
interface C extends A {
    void displayC();
}
class D implements B, C {
    public void show() {
        System.out.println("Method from A");
    }
    public void displayB() {
        System.out.println("Method from B");
    }
    public void displayC() {
        System.out.println("Method from C");
    }
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
        obj.displayB();
        obj.displayC();
    }
}