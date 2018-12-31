package sample;

public class CustomException extends Exception {
	
	private String exec_message ;
	
	private CustomException(String e) {
		this.exec_message = e;
	
	}
	
	private void display() {
		System.out.println("error message : "+ exec_message);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			throw new CustomException("new customn exception");
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.display();
		}
	}

}
