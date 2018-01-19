package contrl;
import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		/*{
			int i = 5;
			System.out.println(i);
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.print("남자 : 1, 여자 : 2를 입력하세요");
		int n = sc.nextInt();
		if(n==1) {
			System.out.println("남자");
		}
		else if(n==2) {
			System.out.println("여자");
		}
		else {
			System.out.println("에러");
		}
		System.out.println("종료");
	}
}
