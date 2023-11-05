package javaprogramme5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Write a Java program to iterate through all elements in an array list
 */
public class Programme_5_ArrayListIteration {
    // main method
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        // create arraylist and element
        ArrayList<String> car = new ArrayList<>();
        car.add("Skoda");
        car.add("Nishan");
        car.add("Toyota");
        car.add("Audi");
        System.out.println("Iterating through ArrayList elements using Iterator:");
        name = scanner.nextLine();
        iterateArrayList(car);
        scanner.close();
    }

    public static void iterateArrayList(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        System.out.println("Element in the ArrayList");
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}