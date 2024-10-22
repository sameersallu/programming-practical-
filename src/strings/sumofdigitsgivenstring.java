package strings;

public class sumofdigitsgivenstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abc123def";
System.out.println(str);
int sum=0;
for(int i=0;i<str.length();i++)
{
	char ch=str.charAt(i);
	if(ch>=48&&ch<57)
	{
		ch-=48;
		sum = sum+ch;
	}
}System.out.println(sum);
	}

}
