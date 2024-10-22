package numberseries;

import java.util.Scanner;

public class sumofnuturalnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();
int sum=0;
for(int i=1;i<=num;i++)
{
	//System.out.println(i);
	sum=sum+i;
}
System.out.println(sum);
	}

}