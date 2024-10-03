package noemi.zoo.com;


public class Hyena extends noemi.zoo.com.Animal {
    //Create a static int that keeps track of the number of Hyena created
    static int numOfHyenas = 0;


    // Create a constructor
    public Hyena() {
        super();
        numOfHyenas++;
    }



}
