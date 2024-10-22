package numberpattern;

public class leftpyramidnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=5;i++)
{int m=5;
	int n=1;
	for(int j=1;j<=5;j++)
	{
		if(i+j>=5+1)
		{
			System.out.print(n+++" ");
		}else {
			System.out.print(m--+" ");
		}
	}System.out.println();
}
	}

}
