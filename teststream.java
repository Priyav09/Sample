package sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class teststream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*  final List<Integer> numbers = Arrays.asList(1, 2, 3, 100, 23, 93, 99);

	  int max =  numbers.stream()
	  			.max((num1 , num2) -> num1 > num2 ? 1 : -1)
	  			.get();

	  System.out.println(max);*/
		
		 int[] arr = new int[4]; 
try {
        // this statement causes an exception 
        int i = arr[4]; 
        System.out.println("Hi, I want to execute"); 
}
catch(Exception e) {
	System.out.println("jashda");
}
        // the following statement will never execute 
        
}
}