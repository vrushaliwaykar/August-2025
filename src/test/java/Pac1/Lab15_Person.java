package Pac1;

import java.time.LocalDate;
import java.time.Period;

public class Lab15_Person 
{

	String firstName;
	String lastName;
	char gender;
	
	// Default constructor
    public Lab15_Person() 
    {
    	
    }
	
 // Parameterized constructor
	public Lab15_Person(String firstName, String lastName, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int calculateAge(String dateOfBirth)
	{
		LocalDate dob=LocalDate.parse(dateOfBirth);
		LocalDate today=LocalDate.now();
		Period age=Period.between(dob, today);
		return age.getYears();
	}
	public String getFullName(String firstName, String lastName)
	{
		return firstName + " "+lastName;
	}
}
