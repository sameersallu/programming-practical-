package patterns;

public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=3;
		for(int i=1;i<2*num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				//if(j==1||i==j||j==num+2||i+j==num*2)//butterfly success
				//if(i+j==num+1||i-j==2||j-i==2||i+j==num*2+2)//diamond success
				//if((i+j==num+1||i==num||i+j==num*2&&j-i<num))//pyramid 3rows 5colunms
			if((i==1||i==j||i==num+2||i+j==num*2))//hour glass success
				//if(j==1||i==j||i+j==num*2) //right pyramid success//5rows 3colunms
				{
				/*if(i==3&&j==2) {
					System.out.print(" ");
				}*/
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
