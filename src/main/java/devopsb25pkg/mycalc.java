package devopsb25pkg;

public class mycalc {

	public int sum(int a, int b)
	{
	return a+b;
	}
	public int diff(int a, int b)
	{
	return a-b;
	}
	public static void main(String[] args) {
	mycalc ob = new mycalc();
	System.out.println ("Sum is: "+ob.sum(20,10)) ;
	System.out.println ("Diff is: "+ob.diff(20,10)) ;
}
}