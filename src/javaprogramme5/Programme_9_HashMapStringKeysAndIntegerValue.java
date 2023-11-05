package javaprogramme5;
/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;

public class Programme_9_HashMapStringKeysAndIntegerValue {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();

        // add value to Hashmap
        people.put("Alex", 18) ;
        people.put("Maya", 15) ;
        people.put("Lexi", 17) ;
        people.put("George", 20) ;
        // call the method
        iterateAge(people );
    }
    // logical method
    public static void iterateAge(HashMap<String,Integer> people){
        for(Integer age : people.values()){
            System.out.println("Age : " + age);
        }
    }
}
