package Pac1;

enum Gender
{
	M, F;
}

public class Lab8_Person 
{
	String firstName;
	String lastName;
	Gender gender;
	String phoneNumber;
	
	 // Default constructor
    public Lab8_Person() 
    {
    	
    }
	
	public Lab8_Person(String firstName, String lastName, Gender gender, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNumber=phoneNumber;
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
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getphoneNumber() {
		return phoneNumber;
	}

}
