package numberseries;

public class xylemnum {
	public static void main(String[] args) {
  int num=1234;
    int extrsum=0;
   int meansum=0;
   int num2=num;
   while(num!=0)
   {
int rem=num%10;
	if(num==num2||num<10)
	{
		extrsum=extrsum+rem;
	}
	else
	{
		meansum=meansum+rem;
	}
	num=num/10;
   }
	if(extrsum==meansum)
	{
		System.out.println("xylem number");
	}else {
		System.out.println("phleam number");
	}
	
}
}
