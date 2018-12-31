package sample;

public class InnerClass {
	
	private int a = 5 ; 
	private static int b = 10; 
	
	{
		System.out.println("Instance initalize");
	}
	
	static {
		System.out.println("static block");
	} 
	
	public InnerClass() {
		System.out.println("constructor");
	}
	
	public static void run(){
		System.out.println("static method");
	}
	
	public static void main(String[] args) {
	
	InnerClass inner = new InnerClass();
	InnerClass inner1 = new InnerClass();
	
	inner.b = inner.b + 1 ; 
	inner.a = inner.a + 1 ; 
	
	System.out.println(inner.b);
	System.out.println(inner1.b);

	System.out.println(inner.a);
	System.out.println(inner1.a); 
	
	InnerClass.main("s");
	} 
	
	public static void main(String arg) {
		System.out.println("secondary main" + arg);
	}
}