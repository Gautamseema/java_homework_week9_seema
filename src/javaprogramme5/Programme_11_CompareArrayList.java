package javaprogramme5;

import java.util.ArrayList;

public class Programme_11_CompareArrayList {
    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Black");
        list1.add("White");
        list1.add("Pink");

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Red");
        list2.add("Green");
        list2.add("Black");
        list2.add("Pink");
         ArrayListComparison(list1,list2);

        // Method  : using equal method to compare Arraylist
        boolean areEqual = list1.equals(list2) ;
        System.out.println("Method : Using equal() method");
        if(areEqual){
            System.out.println("Arraylist1 and Arraylist2 are equal");
        }else {
            System.out.println("Arraylist1 and Arraylist2 are not equal");

        }
    }
    public static boolean ArrayListComparison(ArrayList<String> list1, ArrayList<String > list2){
        if(list1.size() != list2.size()){
            return false;
        } for(int i = 0; i < list1.size(); i++){
            if(!list1.get(i).equals(list2.get(i))){
                return false;
            }
        }
        return true;
    }
}
