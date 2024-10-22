package arrays;

public class palindromelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {11,21,33,42,55};

for(int i=0;i<arr.length;i++)
{
	if(palin(arr[i]))
	{
		System.out.println(arr[i]+" it is palindrom");
	}
}
	}

	private static boolean palin(int num) {
		// TODO Auto-generated method stub
		int rev=0;
		int num1=num;
		while(num!=0)
		{
			int res=num%10;
			rev=rev*10+res;
			num=num/10;
		}
		if(rev==num1)
		{
			return true;
		}
		return false;
	}

}
