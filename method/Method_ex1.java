package method;
import java.util.Scanner;
public class Method_ex1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1.가위 2.바위 3.보 : ");
		int you = sc.nextInt();
		int com = (int)(Math.random() * 3) + 1;
		
		System.out.println("you : "+caption(you));
		System.out.println("com : "+caption(com));

		if ((you == 1 && com == 3) ||
			(you == 2 && com == 1) ||
			(you == 3 && com == 2)) {
			System.out.println("you의 승리입니다.");
		} else if(you == com) {
			System.out.println("비겼습니다.");
		} else {
			System.out.println("you의 패배입니다.");
		}
	}
	public static String caption(int val) {
		if (val == 1) 
			return "가위";
		else if (val == 2) 
			return"바위";
		else
			return"보";
	}
}
