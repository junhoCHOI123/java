package basic;
import java.util.Scanner;
public class Optest10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ 7��° ���� : ");
		
		int n = sc.nextInt();
		System.out.println(n==1 ? "����" : 
						  (n==2 ? "����" : "Error"));
	}
}