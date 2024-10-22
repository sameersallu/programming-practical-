package arrays;

public class duplicatesnotallowed {
	
	public static boolean contains(int[] b,int ele)
	{
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==ele)
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {1,2,3,4,5,2,1,3};
int [] b= new int [a.length];
int k=0;
for(int i=0;i<b.length;i++)
{
	int ele=a[i];
	if(!contains(b,ele))
	{
		b[k++]=ele;
	}
}for(int i=0;i<k;i++)//i<b.length;//output/12345000;
{
	System.out.println(b[i]);
}
	}

}
