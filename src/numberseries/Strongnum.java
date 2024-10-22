package numberseries;

import java.util.Scanner;

public class Strongnum {
	public static int facto(int num)
	{
		int fact=1;
		for(int i=num;i!=0;i--)
		{
			fact=fact*i;
		}
		return fact;
		
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter a num");
int num=scan.nextInt();
int sum=0;
int num2=num;
while(num!=0) {
	int rem=num%10;
	sum=sum+facto(rem);
	
	num=num/10;
}
if(sum==num2)
{
	System.out.println("strong num");
}else {
	System.out.println("not a num");
}
//System.out.println(sum);
}
}
