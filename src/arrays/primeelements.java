package arrays;

public class primeelements {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {1,2,3,4,5};

for(int i=0;i<arr.length;i++)
{
	int count=0;
	int res=arr[i];
	for(int j=1;j<=res;j++)
	{
		if(res%j==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println(arr[i]);
	}
}
/*for(int i=0;i<arr.length;i++)
{
	if(isprime(arr[i]))
	{
		System.out.println(arr[i]);
	}
}*/




	}

}
