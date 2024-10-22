package numberseries;

import java.util.Scanner;

public class primenum {
	
	public static boolean isp(int num) { 
		int count=0;
		for (int i=1;i<=num;i++)
		{
		if(num%i==0)
		{
			
			count++;
		}
		}
		if(count==2)
		{
			return true;//System.out.println("it is a primenumber");
		}
		else {
		return false;	//System.out.println("it is not a primenumber");
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String str="javaprogramming";
//for(int i=0;i<str.length();i++)
//{
//	if(isp(i))
//	{
//		System.out.println(str.charAt(i));
//	}
//}
		for(int i=1;i<=40;i++)
		{
			int count=0;
			for(int k=1;k<=40;k++)
			{
				if(i%k==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
}

}
