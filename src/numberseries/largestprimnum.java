package numberseries;

import java.util.Scanner;

public class largestprimnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a start num");
		int start=scan.nextInt();
		System.out.println("enter a end num");
		int end=scan.nextInt();
int l=1;
for (int i=end;i>=start;i--)
{
	int count=0;
	
		for(int k=1;k<=end;k++)
		{
			if(i%k==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			if(l==1)
			{
				System.out.println(i);
				l++;
	
			}
		}
	
	
}
	}

}
