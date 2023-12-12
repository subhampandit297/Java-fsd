package dom;

//Define an interface A
interface A {
 default void display() {
     System.out.println("Inside Interface A");
 }
}

//Define an interface B that extends A
interface B extends A {
 // No new methods in B
}

//Define an interface C that also extends A
interface C extends A {
 // No new methods in C
}

//Define a class D that implements both B and C
class D implements B, C {
 // D inherits the display() method from both B and C
}

public class DiamondProblemExample {
 public static void main(String[] args) {
     // Create an object of class D
     D obj = new D();

     // Call the display method
     obj.display();
 }
}

