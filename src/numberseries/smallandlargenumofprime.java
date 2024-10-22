package numberseries;

import java.util.Scanner;

public class smallandlargenumofprime{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	System.out.println(" enter a num");
		int start=scan.nextInt();
		System.out.println(" enter a end num");
		int end=scan.nextInt();
	int s=1;
	int sum=0;
	for(int i=start;i<=end;i++)
	{
		int count=0;
		for(int j=1;j<=end;j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}if(count==2)
		{
			if(s==1)
			{
				//System.out.println(i);
				sum=sum+i;
				//System.out.println(sum);
				s++;
			}
		}
	}
	int sum2=0;
	int l=1;
	for(int i=end;i>=start;i--)
	{
		int count=0;
	for(int j=1;j<=end;j++)
	{
		if(i%j==0)
		{
			count++;
		}
	}if(count==2)
	{
		if(l==1)
		{
			//System.out.println(i);
			//sum2=sum2+i;
			sum2=sum+i;
			l++;
		}
	}
	}System.out.println(sum2);
	}
	}


