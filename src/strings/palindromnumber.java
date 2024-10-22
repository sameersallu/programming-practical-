
package strings;

import java.util.Scanner;

public class palindromnumber {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter a string type yasmeen");
	String str=scan.next();
	if(palindrom(str))
	{
		System.out.println("nausheen");
	}
	else {
		System.out.println(" salman bhai");
	}
	
}
public static boolean palindrom(String str)
{
	int i=0;
	int j=str.length()-1;
	while(i<j)
	{
		char ch=str.charAt(i);
		char ch2=str.charAt(j);
		if(ch!=ch2)
		{
			return false;
		}
		i++;
		j--;
	}
	return true;
}
}
