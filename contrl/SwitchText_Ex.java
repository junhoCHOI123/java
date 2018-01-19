package contrl;
import java.util.Scanner;

public class SwitchText_Ex {
	public static void main(String[] args) {
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("남자");
			break;
		case 2:
			System.out.println("여자");
			break;
		case 3:
			System.out.println("남자");
			break;
		case 4 : 
			System.out.println("여자");
			break;
		
		default : 
			System.out.println("에러");
			break;
		}
		System.out.println("종료");
			
	}
}
