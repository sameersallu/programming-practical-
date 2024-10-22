package patterns;

public class rightpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=3;
char ch='A';
for(int i=1;i<num*2;i++)
{char c=ch;
	for(int j=1;j<=num;j++)
	{
		if(i+j>num&&i-j<num)
		//if(i>=j&&i+j<=num*2)
		{
			System.out.print("* ");
			//System.out.print(c++ +" ");
			//System.out.print(ch++ +" ");
		}else {
			System.out.print("  ");
		}
	}System.out.println();
	
	
}
	}

}
