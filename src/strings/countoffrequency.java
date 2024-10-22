package strings;

import java.util.Scanner;

public class countoffrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter a string");
String str=scan.next();
for(int i=0;i<str.length();i++)
{
	char ch=str.charAt(i);
	System.out.println(ch+" frequency is:"+frequency(str,ch));
}
	}

	private static int frequency(String str, char ch) {
		char count = 0;
		for(int i=0;i<str.length();i++)
		{
			char ch2=str.charAt(i);
			if(ch==ch2)
			{
				count++;
			}
		}return count;
	
	}

}
