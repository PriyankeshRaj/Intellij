package com.priyankesh;

public class engg_stud extends Student {

    public void study(){
        System.out.println("Student is studying engineering.");
    }
    public static void main(String[] args) {
        sc_stud obj1 = new sc_stud();
        engg_stud obj2 = new engg_stud();

        obj1.study();
        obj2.study();
    }
}
abstract class Student{
    //abstract method
    public abstract void study();
}

class sc_stud extends Student{
    public void study(){
        System.out.println("Student is studying Science.");
    }
}