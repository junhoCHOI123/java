package method;
import java.util.Scanner;
public class MethodTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1.���� 2.���� 3.�� �Է� > ");
		String you = sc.next();
		String com = getHand();
		System.out.println("you : "+you);
		System.out.println("com : "+com);
	}

	private static String getHand() {
		int com = (int)Math.random()*3+1;
		return com == 1?"����":
			   com == 2?"����":
			   com == 3?"��":
				   	    "����";
	}
}
