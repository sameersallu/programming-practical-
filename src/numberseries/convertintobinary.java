package numberseries;

import java.util.Scanner;

public class convertintobinary {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	int bin=0;
	int rev=1;
	while(num!=0)
	{
		int rem=num%2;
		 bin=bin+rem*rev;
		 rev=rev*10;
		 num=num/2;
	}
	System.out.println(bin);
}
}
