package basic;

public class RunStatementExample {
	public static void main(String[] args) {
		boolean x = true;
		System.out.println("x : " +x);
		
		byte b = 1;
		System.out.println("b : "+b);
		
		char c = 'a';
		System.out.println(c);
		
		short s = 32767;
		System.out.println("s : " + s);
		
		int i = 2147483647 + 1;
		System.out.println("i : "+i);
		
		long l1 = 2147483648L;
		System.out.println("l1 : "+l1);
		
		float f = 3.1415926535f;
		System.out.println("f : " +f);
		
		double d = 3.1415926535;
		System.out.println("d : "+d);
		
		System.out.println("1\t2\t3");
		System.out.println("1\n2\n3");
	}
}