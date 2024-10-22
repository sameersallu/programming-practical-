package numberseries;

import java.util.Scanner;

public class printthedaysofmonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter a year");
int year=scan.nextInt();
System.out.println("enter a month");
String month=scan.next();
switch(month)
{
case "jan":
case "mar":
case "may":
case "july":
case "aguest":
case "oct":
case "dec":
	System.out.println("31 days "+month);
	break;
case "april":
case "jun":
case "sep":
case "nov":
	System.out.println("30 days "+month);
	break;
	default:System.out.println("invaild value");
	break;
	case "feb":if(year%400==0 || year%4==0 && year%100!=0)
	{
		System.out.println("29 days "+month);
	}else {
		System.out.println("28 days "+month);
	}
}








	}

}
