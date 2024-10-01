// 10/1/24
// TodaysDate.java

import java.util.Date;
import java.text.SimpleDateFormat;

public class TodaysDate {
    public static void main(String[] args) {
        System.out.println("Hello to Dates and Animal Class!");

        // Create a Date object to represent the current date
        Date today = new Date();

        // Define the desired data format
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");

        // Format the date and store it in a string
        String strTodaysDate = formatter.format(today);
        String strTodaysYear = formatterYear.format(today);

        System.out.println("Today's date in the format yyyy-MM-dd: " + strTodaysDate);

        System.out.println();

        // Calculate birthdates for the following two hyenas
        // 1) 4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia
        // 2) 12 year old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia

        // Write Java code to calculate birthdate for the animal and then create a method
        // that returns a string for the animal method

        // input: "4 year old female hyena, born in spring"
        // processing: find the age and birth season and then use decision control structures to
        // calculate the date.

        // parse the string
        String strStarting = "12 year old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia";
        // spilt the string on ", "
        String[] arrayOfStrPartsOnComa = strStarting.split(", ");
        // Output the array elements
        // this is a for : each loop - very handy when examining array elements
        int elementNum = 0;
        for (String thePart : arrayOfStrPartsOnComa) {
            System.out.println("Element " + elementNum + " of the string is: " + thePart);
            elementNum++;
        }

        System.out.println();

        int elementNum2 = 0;
        String[] arrayOfStrPartsOnSpace = arrayOfStrPartsOnComa[0].split(" ");
        for (String thePart : arrayOfStrPartsOnSpace) {
            System.out.println("element " + elementNum2 + " of the String is: " + thePart);
            elementNum2++;
        }

        System.out.println();

        int elementNum3 = 0;
        String[] arrayOfStrPartsOnSpace2 = arrayOfStrPartsOnComa[1].split(" ");
        for (String thePart : arrayOfStrPartsOnSpace2) {
            System.out.println("element " + elementNum3 + " of the String is: " + thePart);
            elementNum3++;
        }

        String ageInYears = arrayOfStrPartsOnSpace[0];
        String animalBirthSeason = arrayOfStrPartsOnSpace2[2];
        System.out.println("\nThe age in years of the animal is: " + ageInYears);
        System.out.println("\n The season of birth of the animal is: " + animalBirthSeason);

        String animalBirthDate = "";
        int todaysYear = Integer.parseInt(strTodaysYear);
        int animalBirthYear = todaysYear - Integer.parseInt(ageInYears);

        if (animalBirthSeason.contains("spring")) {
            animalBirthDate = Integer.toString(animalBirthYear) + "-03-21";
        }

        if (animalBirthSeason.contains("fall")) {
            animalBirthDate = Integer.toString(animalBirthYear) + "-09-21";
        }

        if (animalBirthSeason.contains("winter")) {
            animalBirthDate = Integer.toString(animalBirthYear) + "-12-21";
        }

        if (animalBirthSeason.contains("summer")) {
            animalBirthDate = Integer.toString(animalBirthYear) + "-06-21";
        }


        System.out.println("\n animalBirthDate = " + animalBirthDate);








    }
}