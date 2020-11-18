package Day14;

public class Methodoverloading {
     
	
	// polymorphism means many forms
	//implementing the method overloading concept:either the parameter could be diff or return type of the parameter 
	//could be diff.
	public void add(int a, int b) 
	{
		System.out.println(a+b);
	}
		
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void add(double a, double b) {
		System.out.println(a+b);
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methodoverloading obj= new Methodoverloading();
		obj.add(3.4, 4.5);
		obj.add(6, 7);
		obj.add(5, 5, 9);
		
	}

}
