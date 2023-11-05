package javaprogramme5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater
 */

public class Programme_6_RetrieveAnElement {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in ) ;
        //create arraylist
        ArrayList<String> fruits = new ArrayList<>() ;
        // add element to  the array list
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Orange");
        fruits.add("Banana");
        System.out.print("enter the index to retrieve an element :");
        int indexToRetrieve = scanner.nextInt();
        String element = retrieveElementAtIndex(fruits, indexToRetrieve );
         if(element != null){
             System.out.println("Element at index " + indexToRetrieve  + " : " + element);
         }else {
              System.out.println("Index is out of bound.");
             scanner .close() ;
         }
   }
      public static String retrieveElementAtIndex(ArrayList<String> list, int index) {
          if (index >= 0 && index < list.size()) {
              return list.get(index);
          }
          return null;
      }}