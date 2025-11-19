package org.example;
class College{
    void college(){
        System.out.println("Studying in SJCET, Palai");
    }
}
//Inheriting Student Class From College Class.
class Student extends College{
    void student(){
        System.out.println("I am a CSE Student ");
    }
}
public class Inheritance_Demo {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.student(); // Method From the Student Class (Child Class).
        obj.college(); // Method Extended from the College Class (Parent Class).

    }
}
