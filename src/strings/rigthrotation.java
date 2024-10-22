package strings;

import java.util.Scanner;

public class rigthrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner (System.in);
System.out.println("enter a string");
String str =scan.next();
System.out.println("enter a num");
int userinput=scan.nextInt();
String res="";
for(int i=str.length()-userinput;i<str.length();i++)
{
	char ch=str.charAt(i);
	res=res+ch;
}
for(int j=0;j<str.length()-userinput;j++)
{
	char ch=str.charAt(j);
	res=res+ch;
}
System.out.println(res);
	}

}
