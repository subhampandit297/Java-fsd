public class TypeCasting {
    public static void main(String[] args) {
        
        int intValue = 40;
        double doubleValue = intValue; 

        System.out.println("Implicit Type Casting:");
        System.out.println("int value: " + intValue);
        System.out.println("double value after implicit casting: " + doubleValue);

        System.out.println("\nExplicit Type Casting:");
        
        double newDoubleValue = 50.5;
        int newIntValue = (int) newDoubleValue; 

        System.out.println("double value: " + newDoubleValue);
        System.out.println("int value after explicit casting: " + newIntValue);

    
    }
}
