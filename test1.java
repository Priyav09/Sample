package test;

import java.lang.reflect.Method;
//import java.util.Collections;;
public class test1 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		int i = 11;
		int i1 = 5 ;
		double d;
		d=3+(i/i1)+2 ;
	  System.out.println(d);
	  
	  Class c=Class.forName("java.util.Collections");
	  Method[] m=c.getDeclaredMethods();
	  for(Method mtd:m)
		  System.out.println(mtd);
	}

}
