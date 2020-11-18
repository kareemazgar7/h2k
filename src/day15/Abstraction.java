package day15;

public abstract class Abstraction {

	public abstract void printname();//declared the method
	
	public void printnameali()  // normal method defined with the body
	{
		System.out.println("Ali");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Abstraction mean having methods that are abstract in nature 
		//abstract in nature just declaration of methods
		//if the abstract method in class then the class has to be made  abstract as well.
		//we should notify any class who so ever inherit it 
		//abstraction is not 100% data hiding
		//abstraction we have both abstract and non abstract method
		//when the method is declared but the no body is defined
		//Abstract class has possibility to have both abstract and non abstract method	

}
}
