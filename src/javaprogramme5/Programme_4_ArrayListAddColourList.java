package javaprogramme5;

import java.util.ArrayList;

public class Programme_4_ArrayListAddColourList {
    // main method
    public static void main(String[] args) {

        ArrayList<String> colours = new ArrayList<>();
        // Add colors to the ArrayList
        colours.add("Pink");
        colours.add("Blue");
        colours.add("White");
        colours.add("Red");



    // call method in main method
    printColours(colours);

}
 // add colour to the arraylist
   public  static void addColour(ArrayList<String> list ,String colour){
       list.add( colour ) ;
    }
    // print out the collection using for each loop
    public static void printColours(ArrayList<String> list){
        System.out.println("Colours in the ArrayList:");
        for(String colour :list){
            System.out.println(colour);
        }
  }
}
