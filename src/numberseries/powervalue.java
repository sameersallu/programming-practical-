package numberseries;

public class powervalue {
	public static void main(String[] args) {
		int base=12;
		int exp=3;
		int powervalue=1;
		for(int i=1;i<=exp;i++)
		{
			powervalue=powervalue*base;
		}
		System.out.println(powervalue);
		
	}

}
