package numberpattern;

public class numberspattren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
for(int i=1;i<=n;i++)
{//int f=n;
	int m=5;
	int nu=1;
	for(int j=1;j<=i;j++)
	{if(i+j==n+1)
	{
		System.out.print(nu+++" ");
	}else {
		
		System.out.print(m--+" ");
	}
		//System.out.print(f-- +" ");
		//System.out.print(f++ +"  ");
		/*if(i%2==0)
		{
			System.out.print("2 ");
		}else {
		System.out.print("1 ");
		}*/
	}System.out.println();
	
}
	}

}
