package numberseries;

import java.util.Scanner;

public class findleapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter a year");
int year=scan.nextInt();
if(year%400==0 || year%4==0 &&year%100!=0)
{
	System.out.println(year+" it is leap year");
}else {
	System.out.println("it is not a leap year");
}




	}

}
