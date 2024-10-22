package strings;

public class waptoprintsumofvowelandconsonates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="programming";
int count=0;
int countcon=0;
for(int i=0;i<str.length();i++)
{
	char ch=str.charAt(i);
if(ch=='a'||ch=='A'||ch=='e' ||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
		count++;
	}else {
		countcon++;
	}
}System.out.println(count);
System.out.println(countcon);
	}
	
}
