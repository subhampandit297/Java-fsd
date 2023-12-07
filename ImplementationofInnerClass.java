package com;

class Outer {
    private int outerField;

    public Outer(int outerField) {
        this.outerField = outerField;
    }

    class Inner {
        private int innerField;

        public Inner(int innerField) {
            this.innerField = innerField;
        }

        public void display() {
            System.out.println("Outer Field: " + outerField);
            System.out.println("Inner Field: " + innerField);
        }
    }
}

public class ImplementationofInnerClass {
    public static void main(String[] args) {
        Outer outerObject = new Outer(10);
        Outer.Inner innerObject = outerObject.new Inner(20);
        innerObject.display();
    }
}

