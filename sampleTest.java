package sample;

public class sampleTest {
	
	public void reverseString(String s) {
		String[] words = s.split(" ");
		String reversedString="";
		
		for(int i = 0 ; i < words.length ; i++) {
			StringBuilder sb = new StringBuilder(words[i]);
			sb = sb.reverse();
			reversedString = reversedString + sb + " ";
		}
		
		System.out.println(reversedString);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sampleTest st = new sampleTest();
		st.reverseString("This is Wipro");
	}

}
