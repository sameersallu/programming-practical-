package strings;

public class smallestandsesallest {

	public static void main(String[] args) {
		int [] arr= {1,1,2,3,4,5};
		int smallest = arr[0];
		int secsmallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(smallest>arr[i])//
			{ 
				secsmallest=smallest;
				smallest=arr[i];
			}else{
				if(secsmallest>arr[i] || smallest==secsmallest) {
					
					if(smallest!=arr[i])
					{
						secsmallest=arr[i];
					}
					
				}
			
			
			}
		}System.out.println(smallest);
		System.out.println(secsmallest);
	}

}
