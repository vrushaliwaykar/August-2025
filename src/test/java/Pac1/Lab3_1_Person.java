package Pac1;

class InvalidNameException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidNameException(String message)
	{
		super(message);
	}
}
public class Lab3_1_Person 
{
	String firstName;
	String lastName;
	
	public Lab3_1_Person(String firstName, String lastName) throws InvalidNameException
	{
		if(firstName.isEmpty()||lastName.isEmpty())
		{
			throw new InvalidNameException("First Name or last name cannot be blank..");
		}
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public void display()
	{
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name:"+lastName);
	}

}


