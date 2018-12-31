package fs.java.basic;

public class Program3 {
	
	private void calculateGrade(int marks) {
		
		if(marks >= 80 ) {
			System.out.println("Grade A");
		}
		else if (80 > marks && marks >= 60) {
			System.out.println("Grade B");
		}
		else if (60 > marks && marks >= 40) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Grade D");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program3 program = new Program3();
		program.calculateGrade(55);
	}
}
