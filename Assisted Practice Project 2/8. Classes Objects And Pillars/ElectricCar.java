package dom;

//Subclass demonstrating Inheritance
class ElectricCar extends Car {
 // Additional attribute
 private int batteryCapacity;

 // Constructor
 public ElectricCar(String brand, String model, int year, int batteryCapacity) {
     super(brand, model, year);
     this.batteryCapacity = batteryCapacity;
 }

 // Override the displayInfo method for polymorphism
 @Override
 public void displayInfo() {
     super.displayInfo(); // Call the superclass method
     System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
 }
}