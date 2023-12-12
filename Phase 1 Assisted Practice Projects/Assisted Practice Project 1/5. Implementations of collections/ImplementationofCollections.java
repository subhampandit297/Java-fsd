package dom;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

public class ImplementationofCollections {
    public static void main(String[] args) {
        // ArrayList example
        System.out.println("ArrayList Example:");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        displayCollection(arrayList);

        // LinkedList example
        System.out.println("\nLinkedList Example:");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Blue");
        displayCollection(linkedList);

        // HashSet example
        System.out.println("\nHashSet Example:");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("C++");
        displayCollection(hashSet);

        // HashMap example
        System.out.println("\nHashMap Example:");
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "RAHUL");
        hashMap.put(2, "ROHAN");
        hashMap.put(3, "BOBBY");
        displayMap(hashMap);
    }

    private static void displayCollection(Iterable<String> collection) {
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    private static void displayMap(HashMap<Integer, String> map) {
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}

