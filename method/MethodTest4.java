package method;

import java.util.Scanner;

public class MethodTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1.�ﰢ�� 2.�簢�� � ������ ���̸� ���Ͻðڽ��ϱ�? >");
		int num = sc.nextInt();
		if (num == 1) {
			System.out.print("�غ� : ");
			int meet = sc.nextInt();
			System.out.print("���� : ");
			int hgt = sc.nextInt();
			System.out.println("�ﰢ���� ���̴�" + triarea(meet, hgt) + "�Դϴ�.");
		} else if (num == 2) {
			System.out.print("���� : ");
			int row = sc.nextInt();
			System.out.print("���� : ");
			int col = sc.nextInt();
			System.out.println("�簢���� ���̴�" + ractarea(row, col) + "�Դϴ�.");
		} else {
			System.out.println("���ڸ� �ٽ� �Է��ϼ���.");
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
