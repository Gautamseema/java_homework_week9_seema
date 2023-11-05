package javaprogramme5;
/**
 * Write a Java program to test if an array list is empty or not.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Programme_7_ArrayEmptyOrNot {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in );
        ArrayList <Integer> myList = new ArrayList<>() ;
        System.out.println("Enter integer to add to the ArrayList ( enter '0' to stop)");
        input = scanner.nextInt() ;
        scanner .close() ;

        // adding elements to the ArrayList
        myList.add(1);
        myList.add(2);
        myList.add(3);

        boolean isEmpty = isArrayListEmpty(myList);
        if(isEmpty ){
            System.out.println("The Array is empty");
        }else {
            System.out.println("The Array is not empty");
        }
        }
        //logicl method
       public static boolean isArrayListEmpty(ArrayList <?> list){
        return list.isEmpty() ;
       }


    }

