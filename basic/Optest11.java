package basic;
import java.util.Scanner;
public class Optest11 {
	public static void main(String[] args) {
		System.out.print("���ڸ� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(n%2==0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.");
	}
}
