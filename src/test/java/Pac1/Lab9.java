package Pac1;

public class Lab9 
{

	public static void main(String[] args) 
	{
		
		String str1="apple";
		System.out.println(str1+str1);
		StringBuilder str2=new StringBuilder(str1);
		
		int len=str1.length();
		System.out.println("Length is: "+len);
		for(int i=0;i<len;i++)
		{
			if(i%2==0)
			{
				str2.setCharAt(i, '#');
			}
		}
		
		System.out.println("odd replaced: "+str2);
		
		StringBuilder noDuplicates = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (noDuplicates.indexOf(String.valueOf(c)) == -1) {
                noDuplicates.append(c);
            }
        }
        System.out.println("After removing duplicates: " + noDuplicates);
        StringBuilder upperOdd = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (i % 2 == 0) {
                upperOdd.append(Character.toUpperCase(c));
            } else {
                upperOdd.append(c);
            }
        }
        System.out.println("Odd-position characters uppercased: " + upperOdd);
	}

}
