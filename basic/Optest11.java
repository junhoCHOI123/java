package basic;
import java.util.Scanner;
public class Optest11 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(n%2==0 ? "짝수입니다." : "홀수입니다.");
	}
}
