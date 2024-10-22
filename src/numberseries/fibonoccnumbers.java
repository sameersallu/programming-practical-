package numberseries;

public class fibonoccnumbers {
public static void main(String[] args) {
	int num=10;
	int a=0;
	int b=1;
	int c=0;
	for (int i=1;i<=num;i++)
	{
		c=a+b;
		a=b;//fibonoc
		b=c;
		//a=b;
		System.out.println(a);
	}
	//System.out.println(a);
}
}
