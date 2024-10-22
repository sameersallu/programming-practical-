package strings;

import java.util.Scanner;

public class stringcontainschar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner(System.in);
System.out.println("enter a string");
String str=scan.next();
System.out.println("enter a char");
char ch =scan.next().charAt(0);
System.out.println(mi(str,ch));
	}
public static boolean mi(String str,char ch) {
for(int i=0;i<str.length();i++)
{
char c=str.charAt(i);

if(c==ch)
{
return true;
}

}
return false;
}
	

}
