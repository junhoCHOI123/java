package method;
import java.util.Scanner;

public class MethodTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 넓이를 계산합니다. 반지름 : ");
		int r = sc.nextInt();
		System.out.println("원의 넓이 : "+area(r));
	}

	private static double area(int r) {
		double result = r*r*Math.PI;
		return result;
	}
}
