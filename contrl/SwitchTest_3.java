package contrl;
import java.util.Scanner;

public class SwitchTest_3 {
	public static void main(String[] args) {
		System.out.print("������ �Է��ϼ��� : ");
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
		case 1 : System.out.print("A�Դϴ�.");
				 break;
		case 2 : System.out.print("B�Դϴ�.");
		 		 break;
		case 3 : System.out.print("C�Դϴ�.");
		 		 break;
		case 4 : System.out.print("D�Դϴ�.");
		 		 break;
		default : System.out.print("E�Դϴ�.");
		         break;
		}
	}
}
