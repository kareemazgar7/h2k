package Day11;

public class ForEachLoopArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int b[] =new int[] {20,30,40,50,60,70,2,2,2,2,2,4,4,4};
		
		
		/*for(int i=0; i<b.length; i++)
		{
		System.out.println(b[i]);//b[0],b[1]
		}*/
	
		
		//for each loop
	for(int i:b) //now elements of b assigned to i but one by one
	{
		System.out.println(i);
	}
	
	}

}
