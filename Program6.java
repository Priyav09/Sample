package fs.java.basic;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime = 51 , count = 0;
		
		for (int i = 1 ; i < prime/2 ; i++) {
			if(prime % i == 0) {
				count++ ;
			}
		}
		if(count > 1) {
			System.out.println("Not a prime number ");
		} else
			System.out.println("Prime number ");
	}

}
