package sample;

class Inheritance {
	int a = 1 ; 

	protected void display() {
		System.out.println("base class");
	}
	
}

public class InheritanceTest extends Inheritance{
	
	public static void main(String[] args) {
		
		InheritanceTest it = new InheritanceTest();
		it.display();
	}
}

