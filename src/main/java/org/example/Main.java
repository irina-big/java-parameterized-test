package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyClass myClass = new MyClass (3,7);
        System.out.println("Сумма " + myClass.getxVar()+"+" + myClass.getyVar() + "=" + myClass.sumXY());
    }
}