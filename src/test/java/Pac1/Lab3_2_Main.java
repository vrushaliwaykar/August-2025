package Pac1;

public class Lab3_2_Main {
    public static void main(String[] args) {
        try {
             new Lab3_2_Person("Smith", 30);
             new Lab3_2_Person("Kathy", 10); // invalid age
        } catch (Lab3_2_InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}