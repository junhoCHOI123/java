package contrl;

public class DoWhileTest {
	public static void main(String[] args) {
		int n1, n2;
		
		n1=(int)Math.random()*6+1;
		do {
			n2 = (int) Math.random() * 6 + 1;
		} while (n2==n1);
		
		System.out.println(n1 +","+n2);
	}
}
