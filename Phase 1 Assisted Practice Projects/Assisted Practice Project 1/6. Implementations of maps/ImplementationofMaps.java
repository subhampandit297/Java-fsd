package dom;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class  ImplementationofMaps {
    public static void main(String[] args) {
        // HashMap example
        System.out.println("HashMap Example:");
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Apple");
        hashMap.put(1, "Banana");
        hashMap.put(2, "Orange");
        displayMap(hashMap);

        // TreeMap example
        System.out.println("\nTreeMap Example:");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Red");
        treeMap.put(1, "Green");
        treeMap.put(2, "Blue");
        displayMap(treeMap);
    }

    private static void displayMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

