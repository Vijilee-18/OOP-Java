package org.example;
class MathOperation{
    int calc(int x,int y){
        int sum=x+y;
        return sum;
    }
    int calc(int x, int y,int z){
        int difference=x-y-z;
        return difference;
    }
    double calc (double x,double y){
        double sum_B=x+y;
        return sum_B;
    }
}
public class Polymorphism_Overloading {
    public static void main(String[] args) {
        MathOperation obj =new MathOperation();
        System.out.println("Sum:"+(obj.calc(5,20)));
        System.out.println("Difference:"+obj.calc(10,2,3));
        System.out.println("Sum with points:"+obj.calc(1.2,3.4));
    }
}
