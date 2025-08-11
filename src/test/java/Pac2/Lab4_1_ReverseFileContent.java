package Pac2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab4_1_ReverseFileContent 
{
	public static void main(String[] args) throws IOException {
        
        FileReader fr = new FileReader("src/test/java/Pac2/input.txt");
        StringBuilder sb = new StringBuilder();

        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        fr.close();

        
        sb.reverse();

        
        FileWriter fw = new FileWriter("src/test/java/Pac2/output.txt");
        fw.write(sb.toString());
        fw.close();

        System.out.println("Reversed content written to output.txt");
    }

}
