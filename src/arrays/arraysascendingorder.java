package arrays;

public class arraysascendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {5,3,2,1,4};
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a.length-1-i;j++)
	{
		if(a[i]>a[j+1])
		{
			int temp=a[i];
			a[i]=a[j+1];
			a[j+1]=temp;
		}
	}
}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}

	}

}
