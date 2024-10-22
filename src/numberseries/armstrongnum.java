package numberseries;

public class armstrongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=153;
int num2=num,num3=num2;
int count=0;
while(num!=0)
{
	num=num/10;
	count++;
}
//System.out.println(num);
//System.out.println(count);
int sum=0;
while(num2!=0)
{
	int rem=num2%10;//3
	
	int power=1;
	for(int i=1;i<=count;i++)
	{
		power=power*rem;
	
	}
		sum=sum+power;
	num2=num2/10;
	

}
System.out.println(sum);
if(sum==num3)
{
	System.out.println("it is an armstrong number ");

}else
{
	System.out.println("it is not a armstrong number");
}
	}

}
