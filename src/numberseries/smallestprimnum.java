1package numberseries;

import java.util.Scanner;

public class smallestprimnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a start num");
		int start=scan.nextInt();
		System.out.println("enter a end num");
		int end=scan.nextInt();
int j=1;
for(int i=start;i<=end;i++)
{
	int count=0;
	for (int k=1;k<=end;k++)
	{
		if(i%k==0)
		{
			count++;
		}
	}
	if(count==2)
	{
	if(j==1)
	{
		System.out.println(i);
		j++;
	}
	}
}
	}

}
