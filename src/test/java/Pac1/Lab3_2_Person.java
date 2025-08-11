package Pac1;

public class Lab3_2_Person {
    private String name;
    private float age;

    public Lab3_2_Person(String name, float age) throws Lab3_2_InvalidAgeException {
        if (age <= 15) throw new Lab3_2_InvalidAgeException("Age must be above 15!");
        this.name = name;
        this.age = age;
    }
    public String toString() { return "Name: " + name + ", Age: " + age; }
}