package arrays;

public class oddindexswaping{//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr={1,2,3,4,5,6,7,8};
int num=0;
int num1=0;
for(int i=0;i<arr.length;i++)
{
	if(i%2!=0)
	{
		num=arr[i];
		int j=i+1;
		for(;j<arr.length;j++)
		{
			if(j%2!=0)
		{
			num1=arr[j];
			arr[i]=num1;
			arr[j]=num;
			break;
		}
		
		}
		i=j+1;
	}
}
for(int k=0;k<arr.length;k++)
{
	System.out.println(arr[k]);
}
	}
	}