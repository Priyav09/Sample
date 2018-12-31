package sample;

import java.util.HashMap;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map<String,String> m = new HashMap<String,String>();
	test obj=new test();
	obj.reversestring("I am prasanna");
	}
public void reversestring(String str)
{
	String words[]=str.split("\\s");
	String revword="";
	for(int i=0;i<words.length;i++)
	{ 
		String revstring="";
		for(int j=words[i].length()-1;j>=0;j--)
		{
			revstring=revstring+words[i].charAt(j);
		}
		revword=revstring+" "+revword;
		revword=revword.trim();
	}
	System.out.println(revword);
	}
}
