// TreeMap is used just like HashMap but the outcome is in sorted order.

import java.util.*;
public class LearnTreeMap {
    public static void main(String[] args) {
        // Syntax: Maptype or Map<KeyDatatype, ValueDataType> MapName =  new MapTypeConstructor();

        Map<String,Integer> numbers = new TreeMap<>();

        // To insert key,value pairs

        numbers.put("One",1);
        numbers.put("Two",2);
        System.out.println(numbers);


        // To check if the key is about to be overriden
      /*  if(!numbers.containsKey("Two")){
            numbers.put("Two",3);
        }

        System.out.println(numbers);*/

        // Insted of the above code we can use the IfAbsent() function to add a key, value pair also

        numbers.putIfAbsent("Three",3);
        System.out.println(numbers);

        // ITERATION THROUGH A MAP
        /*for (Map.Entry<String,Integer> e:numbers.entrySet()){
            // For printing every entry in the Map
            System.out.println(e); // 'e' is the iterator
            //For just printing keys
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }*/



        // to just get keys
        for (String key: numbers.keySet()){
            System.out.println(key);
        }

        // to check whether the map is empty or not
        System.out.println(numbers.isEmpty());

        numbers.remove("Three");
        System.out.println(numbers);
    }
}
