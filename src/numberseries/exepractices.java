package numberseries;

import java.util.Scanner;

public class exepractices {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println(" enter a number");
int num=scan.nextInt();
/*int num2=num;
int num3=num2;
int count=0;
int sum=0;
while(num!=0)
{
	num=num/10;
	count++;
}
while(num2!=0)
{
	int power=1;
	int rem=num2%10;
	for(int i=1;i<=count;i++)
	{
	
		power=power*rem;
		
	}
	sum=sum+power;
	num2=num2/10;
	
	System.out.println(sum);
}*/
/*int count=0;
for(int i=1;i<=num;i++)
{
	if(num%i==0)
	{
		count++;
	}
}if(count==2)
{
	System.out.println(" it is primenum");
}else {
	System.out.println("not a prime num");
}*/
/*int num2=num;
int sum=0;
while(num!=0)
{
	int rem=num%10;
	sum=sum+rem;
	num=num/10;
	
}
int sum2=sum;
while(sum2==sum)
{
	sum2=sum*sum;
}
System.out.println(sum2);
if(sum2==num2)
{
	System.out.println("it is a neon num");
}else {
	System.out.println(" it is not a neon num");
}*/
int bin=0;
int rev=1;
while(num!=0)
{
	int rem=num%2;
	bin=bin+rev*rem;
	rev=rev*10;
	num=num/2;
}System.out.println(bin);











































	}

}
