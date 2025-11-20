package org.example;
class Animal{
    void type(){
        System.out.println("I am a Golden Retriver ");
    }
}
class Breed extends Animal{
    void type(){
        System.out.println("I am a Dog");
    }
}
public class Polymorphism_Overriding {
    public static void main(String[] args) {
        Animal obj =new Breed();
        obj.type();
    }
}
