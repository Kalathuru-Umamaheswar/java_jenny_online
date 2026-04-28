package me.jenny.oopexercises.interfaceexercises;

public class Division implements ArithmeticOperations{
    public double calculate(int a,int b){
        if(b==0){
            throw new ArithmeticException("Divide by Zero is not allowed");
        }
        return a/b;
    }
}
