package arrays;

public class palindromwordofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
for(int i=1;i<=10;i++)
{int c=0;
	for(int j=1;j<=10;j++)
	{
		if(i%j==0)
		{
			c++;
		}
		
		}if(c==2)
		{
			if(k==1)
			{
				System.out.println(i);
			System.out.println("---------------------------------");
				k++;
			}
	}
	
	int count =0;
	for(int j=1;j<=10;j++)
	{
		if(i%j==0)
		{
			count++;
		}
	}if(count==2)
	{
		System.out.println(i);
	}
	
}
	}

}
