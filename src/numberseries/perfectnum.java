package numberseries;

import java.util.Scanner;

public class perfectnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner(System.in);
int num=scan.nextInt();
int sum=0;
for(int i=1;i<num;i++)
{
	if(num%i==0)
	{
	sum=sum+i;	
	}
	
}
//System.out.println(sum);
if(sum==num)
{
	System.out.println("perfect num");
}else {
	System.out.println("not a perfect num");
}
	}

}
