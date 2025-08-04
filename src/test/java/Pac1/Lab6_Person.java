package Pac1;

public class Lab6_Person {
	 
		String firstName;
		String lastName;
		char gender;
		
		// Default constructor
	    public Lab6_Person() {
	    }
		
	 // Parameterized constructor
		public Lab6_Person(String firstName, String lastName, char gender) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
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
		
		
	}
	 
	