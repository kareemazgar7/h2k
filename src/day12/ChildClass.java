package day12;

public class ChildClass extends ParentClass{
    
	public void classSummary() 
	{
		System.out.println("i am the method of child class");
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 
		ChildClass obj= new ChildClass();
		obj.summary();
		obj.classSummary();
	}

}
