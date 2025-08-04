package Pac1;

public class Lab7_Person 
{
	String firstName;
	String lastName;
	char gender;
	String phoneNumber;
	
	 // Default constructor
    public Lab7_Person() {
    }
	
	public Lab7_Person(String firstName, String lastName, char gender, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNumber=phoneNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFisrtName(String firstName) {
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
	public String getphoneNumber() {
		return phoneNumber;
	}
	
}
