package method;
import java.util.Scanner;
public class Method_ex1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1.���� 2.���� 3.�� : ");
		int you = sc.nextInt();
		int com = (int)(Math.random() * 3) + 1;
		
		System.out.println("you : "+caption(you));
		System.out.println("com : "+caption(com));

		if ((you == 1 && com == 3) ||
			(you == 2 && com == 1) ||
			(you == 3 && com == 2)) {
			System.out.println("you�� �¸��Դϴ�.");
		} else if(you == com) {
			System.out.println("�����ϴ�.");
		} else {
			System.out.println("you�� �й��Դϴ�.");
		}
	}
	public static String caption(int val) {
		if (val == 1) 
			return "����";
		else if (val == 2) 
			return"����";
		else
			return"��";
	}
}
