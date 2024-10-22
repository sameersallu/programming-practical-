package alphabets;

public class atoz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          char h='A';
          int num=3;
          for(int i=1;i<num*2;i++)
          {
        	  for(int j=1;j<=num;j++)
        	  {
        		  if(i+j>num&&i-j<num) {
        		  System.out.print(i+""+j+" ");
        		  }else {
        			  System.out.print("  ");
        		  }
        		 
        	  }System.out.println();
          }
	}

}
