package Day11;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		//way1
		int a[]=new int[190];// declaring an array can have maximum of 10 values
		 //initializing
		
		//it can only have 10 elements ,positioning starts from 0 to 9th
		
		try {
			
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[9]=10;
		a[10]=100;
		
		}
		catch(Exception e) {
			
			System.out.println("please check index" );
		}
		
		//way2 
		int b[] =new int[] {20,30,40,50,60,70,2,2,2,2,2,4,4,4};
		// array is a collection of elements of same data type
		//it can not store elements of different data type
		
		System.out.println(b.length);
		System.out.println(a.length);
		
		
		for(int i=0; i<b.length; i++)
		{
		System.out.println(b[i]);//b[0],b[1]
		}
	    
		}

}
