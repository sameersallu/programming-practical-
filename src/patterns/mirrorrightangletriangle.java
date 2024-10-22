package patterns;

public class mirrorrightangletriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=5;
     for(int i=1;i<=num;i++)
     {
    	 for(int j=1;j<=num;j++)
    	 {
    		 //if(i+j<=num+1)reverse mirror right angle triangle
    		 if(i+j>=num+1)//mirror right angle triangle
    		 {
    			 System.out.print("* ");
    		 }else {
    			 System.out.print("  ");
    		 }
    	 }System.out.println();
     }
	}

}
