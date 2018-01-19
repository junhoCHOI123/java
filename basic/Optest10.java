package basic;
import java.util.Scanner;
public class Optest10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호 7번째 숫자 : ");
		
		int n = sc.nextInt();
		System.out.println(n==1 ? "남자" : 
						  (n==2 ? "여자" : "Error"));
	}
}