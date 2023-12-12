package dom;

public class ObjectOrientedDemo {
    public static void main(String[] args) {
        // Create objects of the Car class
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Civic", 2021);

        // Display information using the objects
        car1.displayInfo();
        System.out.println(); // Add a line break
        car2.displayInfo();
        System.out.println(); // Add a line break

        // Create an object of the ElectricCar class
        ElectricCar electricCar = new ElectricCar("Tesla", "Model 3", 2023, 75);

        // Display information of the ElectricCar object
        electricCar.displayInfo();
    }
}
