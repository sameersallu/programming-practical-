package patterns;

//import java.util.Scanner;

public class magicnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner scan=new Scanner(System.in);
//System.out.println("enter a num");
int num=5;
for (int i=1;i<=num;i++)
	
{
	int n=i;
	int m=10;
	for(int j=1;j<=num;j++)
{
		if(j%2!=0)
		{
	System.out.print(n+" ");
	n+=2*num;
		}else {
			m=j*num+1-i;
			System.out.print(m+" ");
			
		}
}
System.out.println();
}
	}

}
