package method;

import java.util.Scanner;

public class MethodTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1.삼각형 2.사각형 어떤 도형의 넓이를 구하시겠습니까? >");
		int num = sc.nextInt();
		if (num == 1) {
			System.out.print("밑변 : ");
			int meet = sc.nextInt();
			System.out.print("높이 : ");
			int hgt = sc.nextInt();
			System.out.println("삼각형의 넓이는" + triarea(meet, hgt) + "입니다.");
		} else if (num == 2) {
			System.out.print("가로 : ");
			int row = sc.nextInt();
			System.out.print("세로 : ");
			int col = sc.nextInt();
			System.out.println("사각형의 넓이는" + ractarea(row, col) + "입니다.");
		} else {
			System.out.println("숫자를 다시 입력하세요.");
		}

	}

	private static double ractarea(int row, int col) {
		double result;
		return result = row * col;
	}

	private static double triarea(int meet, int hgt) {
		double result;
		return result = meet * hgt / 2;
	}
}
