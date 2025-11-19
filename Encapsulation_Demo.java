package org.example;
class ID{

     //Making the User_ID and Number as Private
     private String User_ID;
     private int Number;

     //Method to Access the Variables User_ID and Number
     public String getUser_ID(){
         User_ID="VGK@";
         return User_ID;
     }
     public int getNumber(){
         Number=1234567891;
         return Number;
     }
}

public class Encapsulation_Demo {
    public static void main(String[] args) {
        ID id_1=new ID();
        //Calling the Method To Access 
        System.out.println(id_1.getUser_ID());
        System.out.println(id_1.getNumber());
    }
}
