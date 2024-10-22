package strings;

import java.util.Scanner;

public class frequency {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter a string");
String str=scan.next();
System.out.println("enter a character");
char ch=scan.next().charAt(0);

System.out.print(ch+"="+frequencyvalue(str,ch));
	}
public static int frequencyvalue(String str,char ch)
{
	int count = 0;
	for(int i=0;i<str.length();i++)
	{
		char c=str.charAt(i);
		if(ch==c)
		{
			count++;
		}
	}
	return count;
	
}
	
	
}
