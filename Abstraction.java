package org.example;
abstract class Shape{
    abstract void Shape();
}
class Child_Shape extends Shape{
    void Shape(){
        System.out.println("I am a Triangle of 3 Vertex");
    }
}
class ChildShape extends Shape{
    void Shape(){
        System.out.println("I am a Rectangle of 4 vertex");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Child_Shape obj =new Child_Shape();
        obj.Shape();
        ChildShape ob=new ChildShape();
        ob.Shape();
    }
}
