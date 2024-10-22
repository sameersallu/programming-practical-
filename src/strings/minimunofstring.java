package strings;

import java.util.Scanner;

public class minimunofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter a string");
String str=scan.next();
//System.out.println(mininum(str));
char max='0';
int maxa=0;
char min=' ';
int mincount=str.length();
String remdul=remdup(str);
for(int i=0;i<remdul.length();i++)
{
	char ch2=remdul.charAt(i);
	int fery=frequency(str,ch2);
	if(fery<mincount)
	{
		mincount=fery;
		min=ch2;
		
	}
	 if(fery>maxa)
	{
		maxa=fery;
		max=ch2;
	}

	}
System.out.println(max);
System.out.println(min);
	}
	public static int frequency(String str,char ch)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch2=str.charAt(i);
			if(ch2==ch)
			{
				count++;
			}
		}return count;
	}
	/*public static boolean contains(String str,char ch)
	{
		for(int i=0;i<str.length();i++)
		{
			char ch2=str.charAt(i);
			if(ch2==ch)
			{
				return true;
			}
		}return false;
	}*/
	public static String remdup(String str)
	{
		String res="";
		for(int i=0;i<str.length();i++)
		{
			char ch2=str.charAt(i);
			if(!(res.contains(ch2+"")))//ch2 is a charater so we are conerting into string
			{
				res=res+ch2;
			}
		}return res;
	}
	/*public static char mininum(String str)
	{
		char max='0';
		int maxa=0;
		char min=' ';
		int mincount=str.length();
		String remdul=remdup(str);
		for(int i=0;i<remdul.length();i++)
		{
			char ch2=remdul.charAt(i);
			int fery=frequency(str,ch2);
			if(fery<mincount)
			{
				mincount=fery;
				min=ch2;
				
			}
			if(fery>maxa)
			{
				maxa=fery;
				max=ch2;
			}
			return max;
		}return min;
	}*/

}
