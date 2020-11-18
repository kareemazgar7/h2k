package day12;

public class SubchildClass extends ChildClass {
     
	public void subchildmethod()
	{
		System.out.println("i am the subchild class method");
	}
	
	
	public static void main(String[] args) {  //without main method you can't create the main method
		// TODO Auto-generated method stub

		SubchildClass obj1=new SubchildClass();
		obj1.classSummary();
		obj1.summary();
		obj1.subchildmethod();
	}

}
