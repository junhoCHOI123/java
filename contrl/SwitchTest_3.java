package contrl;
import java.util.Scanner;

public class SwitchTest_3 {
	public static void main(String[] args) {
		System.out.print("점수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		int n;
		if(score>=90) 
			n=1;
		else if(score>=80 && score<=89)
			n=2;
		else if(score>=70 && score <=79)
			n=3;
		else if(score>=60 && score <=69)
			n=4;
		else n=5;
		switch(n) {
		case 1 : System.out.print("A입니다.");
				 break;
		case 2 : System.out.print("B입니다.");
		 		 break;
		case 3 : System.out.print("C입니다.");
		 		 break;
		case 4 : System.out.print("D입니다.");
		 		 break;
		default : System.out.print("E입니다.");
		         break;
		}
	}
}
