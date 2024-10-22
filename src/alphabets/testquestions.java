package alphabets;

public class testquestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=5;
int nu=1;
for(int i=1;i<=num;i++)
{
	int n=nu;
	int m=1;
	for(int j=1;j<=num;j++)
	{
		if(i+j<=num+1)
		{
			System.out.print(n+++" ");
		}else {
			System.out.print(m+++" ");
		}
	}System.out.println();
	nu++;
}
	}

}
