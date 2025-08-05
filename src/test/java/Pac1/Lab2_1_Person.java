package Pac1;

public class Lab2_1_Person 
{
	private String name;
	private float age;
	
	public Lab2_1_Person(String name, float age)
	{
		this.name=name;
		this.age=age;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public float getAge()
	{
		return age;
	}
	public void setAge(float age)
	{
		this.age=age;
	}
	@Override
	public String toString()
	{
		return "Name: "+name+", Age: "+age;
	}

}
