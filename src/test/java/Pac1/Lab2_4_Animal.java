package Pac1;

interface Lab2_4_Animal 
{
	// Animal.java
	 void sound();  // Interface method
}

	// Dog.java
	class Dog implements Lab2_4_Animal {

	    @Override
	    public void sound() {
	        System.out.println("Dog barks");
	    }
	}

	


