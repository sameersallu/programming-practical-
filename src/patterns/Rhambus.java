package patterns;

public class Rhambus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=3;
char ch='A';
for(int i=1;i<num*2;i++)
{char c=ch;
for(int j=1;j<=num*2;j++)
{
	if(i+j>num&&j-i<num&&i-j<num&&i+j<3*num)
	{
		//System.out.print("* ");
		System.out.print(ch+++" ");
	}else {
		System.out.print("  ");
	}
}System.out.println();

}
}

	}

