package day8;

public class Nestedifcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int age=130;
		String country="uk";
		
		if(age>=18)
		{
			System.out.println("the person is  pertially eleigble to vote ");
			
			if(country=="us") {
				System.out.println("the person is fully eligble to vote");
			}
		
		
		else
		
		    {
			System.out.println("the person is not citizen of us");
		
		    }	
		}
		else {
			System.out.println("the person is not eligble to vote ");
		}
	}

}
