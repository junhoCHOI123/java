package contrl;
import java.util.Scanner;

public class IfTest_Ex2 {
	public static void main(String[] args) {
		System.out.print("가위:1, 바위:2, 보:3 \n숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int put = sc.nextInt();
		
		int com = (int)((Math.random()*3)+1);
		System.out.println("컴퓨터 : "+com);
		if(put==1) {
			if(com==1) {
				System.out.print("무승부");
			}
			else if(com==2) {
				System.out.print("패배");
			}
			else {
				System.out.print("승리");
			}
		}
		else if(put==2) {
			if(com==1) {
				System.out.print("승리");
			}
			else if(com==2) {
				System.out.print("무승부");
			}
			else {
				System.out.print("패배");
			}
		}
		else {
			if(com==1) {
				System.out.print("패배");
			}
			else if(com==2) {
				System.out.print("승리");
			}
			else {
				System.out.print("무승부");
			}
		}
	}
}
