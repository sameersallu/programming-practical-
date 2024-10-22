package strings;

public class printpremeindexofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="salman";
System.out.println(str);
for(int i=0;i<str.length();i++)
{
	if(preme(i))
	{
		System.out.println(str.charAt(i));
	}
}
	}
	public static boolean preme(int num)
	{
		int count = 0;
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

}
