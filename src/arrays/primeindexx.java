package arrays;

public class primeindexx {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
for(int i=0 ; i < arr.length;i++)
{
	if(isprime(i))
	{
		System.out.println(arr[i]);
	}
}

	}
	public static boolean isprime(int num)
	{int count=0;
		for(int i=1;i<=num;i++)
		{
			
			if(num%i==0)
			{
				
				count++;
			}
		
	}if(count==2)
	{
		return true;
	}
		return false;
	}
}
