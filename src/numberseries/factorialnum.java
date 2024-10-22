package numberseries;

import java.util.Scanner;

public class factorialnum {
	 static int fact=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();
for (int i=num;i!=0;i--)
{
	fact =fact*i;
}
System.out.println(fact);

	}

}
