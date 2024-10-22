package patterns;

public class printpyramid {

	public static void main(String[] args) {
          int num=3;
          for(int i=1;i<=num;i++)
          {
        	  for(int j=1;j<2*num;j++)
        	  {
        		  //if(i+j>=num+1&&j-i<num)//pyramid
        		  if(i<=j&&i+j<=num*2)//reverse pyramid
        		  {
        			  System.out.print("* ");
        		  }else {
        			  if(i+j>=num+1&&j-i<num)
        		  {
        			  System.out.println("* ");
        		  }else {
        			  System.out.print("  ");
        		  }
        		  }
        	  }System.out.println();
          }

	}

}
