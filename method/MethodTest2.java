package method;
import java.util.Scanner;

public class MethodTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���̸� ����մϴ�. ������ : ");
		int r = sc.nextInt();
		System.out.println("���� ���� : "+area(r));
	}

	private static double area(int r) {
		double result = r*r*Math.PI;
		return result;
	}
}
