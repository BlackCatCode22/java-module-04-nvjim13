// NVJ 9/24/24
// arrayListPractice.java

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        System.out.println("Welcome to my ArrayList practice!");

        // Create an array list of strings
        ArrayList<String> myListOfStrings = new ArrayList<>();

        // Add a few elements to my ArrayList
        myListOfStrings.add("first");
        myListOfStrings.add("second");
        myListOfStrings.add("third");

        //Output our ArrayList
        System.out.println("\nmyListOfStrings is: " + myListOfStrings);

        // remove an element
        myListOfStrings.remove(0);

        //Output our ArrayList
        System.out.println("\nAfter removing...");
        System.out.println("\nmyListOfStrings is: " + myListOfStrings);

        // remove an element
        myListOfStrings.remove("third");

        //Output our ArrayList
        System.out.println("\nAfter removing...");
        System.out.println("\nmyListOfStrings is: " + myListOfStrings);

        // use a for loop to add some things to out list
        String toAdd = "";

        for (int i = 0; i < 10; i++) {
            toAdd = toAdd + " adding... " + Integer.toString(i);
            myListOfStrings.add(toAdd);
        }


        //Output our ArrayList
        System.out.println("\nAfter adding a bunch of stuff...");
        System.out.println("\nmyListOfStrings is: " + myListOfStrings);


        // use a for loop to output each element of our array list
        for (int i = 0; i <myListOfStrings.size(); i++) {
            System.out.println("\nAn element in my list is: " + myListOfStrings.get(i));
        }










    }
}