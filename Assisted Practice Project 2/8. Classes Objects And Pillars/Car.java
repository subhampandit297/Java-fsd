package dom;

//Define a class representing a Car
class Car {
 // Attributes (Encapsulation)
 private String brand;
 private String model;
 private int year;

 // Constructor
 public Car(String brand, String model, int year) {
     this.brand = brand;
     this.model = model;
     this.year = year;
 }

 // Methods (Abstraction)
 public void displayInfo() {
     System.out.println("Car Info:");
     System.out.println("Brand: " + brand);
     System.out.println("Model: " + model);
     System.out.println("Year: " + year);
 }

 // Getter and setter methods (Encapsulation)
 public String getBrand() {
     return brand;
 }

 public void setBrand(String brand) {
     this.brand = brand;
 }

 public String getModel() {
     return model;
 }

 public void setModel(String model) {
     this.model = model;
 }

 public int getYear() {
     return year;
 }

 public void setYear(int year) {
     this.year = year;
 }
}
