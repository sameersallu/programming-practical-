package strings;

public class toprintuppercaseofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String str="Java";
		String str="SALMAN";
System.out.println(str);
String res="";
for(int i=0;i<str.length();i++)
{
	
	char ch=str.charAt(i);//lowercase
	//if(ch>=97&&ch<=122)//it is uppercase
	if(ch>=65&&ch<=90)
	{
		//ch-=32;//uppercase
		ch+=32;
		res=res+ch;
	}else {
		res=res+ch;
	}
	
	
}System.out.println(res);
	}

}
