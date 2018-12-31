package sample;

public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1=0,m2=0;
		int[] a= {5,2,4,7,6};
		for(int i=0; i < a.length ; i++)
		{
		if(a[i] > m1)
		{
			m2=m1;
			m1=a[i];
		}
		else if(a[i] > m2)
			m2=a[i];
		}
		System.out.println(m1+" "+m2);
	}

}
