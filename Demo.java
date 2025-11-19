package org.example;
//Creating a Class
class details{

    String Name;
    String Address;
    int age;
    // Creating Methods
    void print(){
        System.out.println("Hello Welcome to OOP-Concepts");
    }
}

public class Demo {
    public static void main(String args[]){
        // Creating an Object
        details n1=new details();
        System.out.println("Name:"+(n1.Name="Vijilee George Kurian"));
        System.out.println("Address:"+(n1.Address="Kuzhikattil"));
        System.out.println("Age:"+(n1.age=19));
        n1.print();
    }
}
