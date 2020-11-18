package Day14;

public class Methodoverriding1 extends Methodoverriding {

	public void printname()
	{
		System.out.println("h2k");
	}
	public void add(int a, int b) {
		System.out.println( a + b);
	}
	public static void main (String [] args) {
		Methodoverriding1 obj= new Methodoverriding1();
		obj.add(5, 8);
		obj.printname();
	}
}
