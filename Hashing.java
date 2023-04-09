import java.util.*;

class Hashing {
    public static void main(String[] args) {
        // Complexity of hashmap is O(1)

        HashMap<String, Integer> map = new HashMap<>();

        // insertion of data in hash map
        // .put is used for insertion of in HashMap
        map.put("India", 200);
        map.put("China", 249);
        map.put("US", 150);
        map.put("Srilanka", 100);
        System.out.println("Insertion Sucessfull");

        // Searching In HashMap
        if (map.containsKey("Japan")) {
            System.out.println("TRUE , key found ");
        } else {
            System.out.println("FALSE ,key not found");
        }

        // .get is used to search Value of key in HashMap
        System.out.println(map.get("China"));

        // .size is used to check the size of the HashMap
        System.out.println(map.size());

        // .keySet is to display all the set value in the key of HashMap
        System.out.println(map.keySet());

        // .remove is used to remove the Key value from the HashMap
        map.remove("China");

        // .size is used to check the size of the HashMap
        System.out.println(map.size());

        // .keySet is to display all the set value in the key of HashMap
        System.out.println(map.keySet());

        // Iteration in HashMap
        // for (Map.Entry<String, Integer> e : map.entrySet()) ;
        // {
        // System.out.println(e.getKey());
        // System.out.println(e.getValue());
        // }

    }
}