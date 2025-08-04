package Pac1;

public class Lab10 
{
	public static boolean isPositiveString(String str) 
	{
        for (int i = 0; i < str.length() - 1; i++) 
        {
            if (str.charAt(i) > str.charAt(i + 1)) 
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "ANT";

        if (isPositiveString(word)) {
            System.out.println(word+" is Positive String");
        } else {
            System.out.println(word+" is not a Positive String");
        }
    }

}
