package patterns;

public class printrightangletriangle {

	public static void main(String[] args) {
		int num=5;
		//int m=1;
		
		for(int i=1;i<=num;i++)
		{int n=5;
		int m=1;
		
			for(int j=1;j<=num;j++)
			{
				if(i==1)
				{
					System.out.print(n--+" ");
				}else if(i==5)
				{
					System.out.print(m+++" ");
				}
				/*if(i>=j) {// right angle triangle
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
				if(i<=j) //it is reverse right angle triangel
				{
					System.out.print(n--+" ");
				}else
				{
					System.out.print(m+++" ");
				}*/
			}System.out.println();
			
			
		}









	}

}
