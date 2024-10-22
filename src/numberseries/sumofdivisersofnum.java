package numberseries;

import java.util.Scanner;

public class sumofdivisersofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
System.out.println(" enter a num");
int num=scan.nextInt();
int sum=0;
for(int i=1;i<num;i++)
{
	if(num%i==0)
	{
		//System.out.println(i);//it is used to print divisor of given number
		sum=sum+i;//sum of the divisor
	}

}
System.out.println(sum);
	}

}
