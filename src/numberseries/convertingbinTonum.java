package numberseries;

import java.util.Scanner;

public class convertingbinTonum {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int bin=scan.nextInt();
	int num=0;
	int rev=1;
	
	while (bin!=0)
	{
		int rem=bin%10;
		num=num+rev*rem;
		rev=rev*2;
		bin=bin/10;
	}
	System.out.println(num);
}
}
