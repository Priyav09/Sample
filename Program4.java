package fs.java.basic;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 0 , next = 1 , temp;
	
		System.out.print(first);
		for(int i = 0; i < 20 ; i++) {
			temp = first ; 
			first = first + next ;
			System.out.print(" " + first);
			next = temp ;
		}
	}
}
