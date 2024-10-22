package strings;

public class vowelsinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="javaprogramming";
System.out.println(str);
int count=0;
int sum=0;
for(int i=0;i<str.length();i++)
{
	char ch=str.charAt(i);
	switch(ch)
	{
	case'a':
	case'A':
	case'e':
	case'E':
	case'I':
	case'i':
	case'O':
	case'o':
	case'u':
	case'U':count++;
	System.out.println(ch);
	}
} 
System.out.println(count);
	}

}
