package contrl;
import java.util.Scanner;

public class IfTest_Ex {
	public static void main(String[] args) {
		System.out.print("������ �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=90)
		{
			System.out.print("A�Դϴ�.");
		}
		else if(80<=n && n<=89)
		{
			System.out.print("B�Դϴ�.");
		}
		else if(70<=n && n<=79)
		{
			System.out.print("C�Դϴ�.");
		}
		else if(60<=n && n<=69)
		{
			System.out.print("D�Դϴ�.");
		}
		else
		{
			System.out.print("E�Դϴ�.");
		}
		
	}

}
