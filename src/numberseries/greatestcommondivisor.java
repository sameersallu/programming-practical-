package numberseries;

import java.util.Scanner;

public class greatestcommondivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("enter a first num");
		int num1=scan.nextInt();
		System.out.println("enter a end num");
		int num2=scan.nextInt();
		int rev=num1>num2?num1:num2;
		int gcd=0;
		for(int i=1;i<=rev;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				gcd=i;
				
			}
		}System.out.println(gcd);
	}

}
