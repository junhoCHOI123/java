package contrl;
import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		/*{
			int i = 5;
			System.out.println(i);
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : 1, ���� : 2�� �Է��ϼ���");
		int n = sc.nextInt();
		if(n==1) {
			System.out.println("����");
		}
		else if(n==2) {
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}
		System.out.println("����");
	}
}
