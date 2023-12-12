package com;

public class ImplementationsOfConstructor {

    public ImplementationsOfConstructor() {
        System.out.println("Default ");
    }

    public ImplementationsOfConstructor(String message) {
        System.out.println("Parameterized Constructor: " + message);
    }

    public ImplementationsOfConstructor(ImplementationsOfConstructor other) {
        System.out.println("Copy Constructor: Copied from another object");
    }

    public static void main(String[] args) {
        ImplementationsOfConstructor defaultConstructorObject = new ImplementationsOfConstructor();
        ImplementationsOfConstructor parameterizedConstructorObject = new ImplementationsOfConstructor("Hello,!");
        ImplementationsOfConstructor originalObject = new ImplementationsOfConstructor("Original Object");
        ImplementationsOfConstructor copyConstructorObject = new ImplementationsOfConstructor(originalObject);
    }
}


