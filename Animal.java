package noemi.zoo.com;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Animal {
    // Create a static int that keep track of the number of animals created.
    static int numOfAnimals = 0;

    // Create a constructor for our new Animal object
    public Animal() {
        numOfAnimals++;
    }

    // Create a constructor that will accept all fields as arguments
    public Animal(String sex, int age, int weight, String animalName, String animalID,
                  String animalBirthDate, String animalColor, String animalOrigin) {
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.animalName = animalName;
        this.animalID = animalID;
        this.animalBirthDate = animalBirthDate;
        this.animalColor = animalColor;
        this.animalOrigin = animalOrigin;
    }



    // Create all attributes (fields) needed for our midterm program
    // sex will be 'male' or 'female'
    private String sex;
    // age will be in years
    private int age;
    // weight will be in pounds
    private int weight;
    // name will be a String
    private String animalName;
    // animalID
    private String animalID;
    // animal birthdate is going to be a string here
    private String animalBirthDate;
    // animalColor is a string
    private String animalColor;
    // origin will be a string like "from Frigula Park, Tenisla"
    private String animalOrigin;




    // Create getters and setters
    public String getAnimalOrigin() {
        return animalOrigin;
    }
    public void setAnimalOrigin(String animalOrigin){
        this.animalOrigin = animalOrigin;
    }



    public String getAnimalColor() {
        return animalColor;
    }
    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }



    public String getAnimalBirthDate() {
        return animalBirthDate;
    }
    public void setAnimalBirthDate(String animalBirthDate) {
        this.animalBirthDate = animalBirthDate;
    }



    public String getAnimalID() {
        return animalID;
    }
    public void setAnimalID(String animalID) {
        this.animalID = animalID;
    }



    public String getAnimalName() {
        return animalName;
    }
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }



    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }



    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }



    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }











}
