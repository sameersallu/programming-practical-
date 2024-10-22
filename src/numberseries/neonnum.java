package numberseries;

import java.util.Scanner;

public class neonnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner (System.in);
int num=scan.nextInt();
int sum=0;
while(num!=0)
{
	int rem=num%10;
	sum=sum+rem;
	num=num/10;
	}
int sum2=sum;
if(sum==sum2)
{
	sum2=sum2*sum;
}
System.out.println(sum);
System.out.println(sum2);

}

}
