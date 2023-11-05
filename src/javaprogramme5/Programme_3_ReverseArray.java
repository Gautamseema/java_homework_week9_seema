package javaprogramme5;

/**
 * Write a Java program to reverse an array of integer values.
 */

public class Programme_3_ReverseArray {
    // main method
    public static void main(String[] args) {
        int[] originalArray = {11, 12, 13, 14, 15,};
        System.out.println("Original Array : ");
        printArray(originalArray );

        int[] reversedArray = reverseArray(originalArray );

        System.out.println("Reversed Array: ");
        printArray(reversedArray );
    }
    // Function to reverse an array of integers
    public static int[] reverseArray (int[] arr){
        int length = arr.length ;
        int[] reversed = new int[length ] ;

        for (int i = 0; i < length; i++){
            reversed[i] = arr[length - 1 - i];
        }
        return reversed;
    }
    // Function to print an array
    public static void printArray (int[] arr){
        for(int i = 0; i < arr.length ; i++){
            System.out.println(arr[i] + " ") ;
        }
        System.out.println();
    }
}
