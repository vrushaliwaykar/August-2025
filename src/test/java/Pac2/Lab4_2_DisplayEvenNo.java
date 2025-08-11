package Pac2;
import java.io.File;  
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lab4_2_DisplayEvenNo 
{
	    public static void main(String[] args) throws IOException {
	      
	        FileWriter writer = new FileWriter("numbers.txt");
	        writer.write("0,1,2,3,4,5,6,7,8,9,10");
	        writer.close();

	       
	        Scanner sc = new Scanner(new File("src/test/java/Pac2/numbers.txt"));
	        sc.useDelimiter(",");

	        while (sc.hasNext())
	        {
	            int num = Integer.parseInt(sc.next().trim());
	            if (num % 2 == 0) 
	            {
	            	System.out.println("Even numbers are: ");
	                System.out.println(num);
	            }
	        }

	        sc.close();
	    }
	


}
