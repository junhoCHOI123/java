package contrl;
import java.util.Scanner;

public class IfTest_Ex {
	public static void main(String[] args) {
		System.out.print("점수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=90)
		{
			System.out.print("A입니다.");
		}
		else if(80<=n && n<=89)
		{
			System.out.print("B입니다.");
		}
		else if(70<=n && n<=79)
		{
			System.out.print("C입니다.");
		}
		else if(60<=n && n<=69)
		{
			System.out.print("D입니다.");
		}
		else
		{
			System.out.print("E입니다.");
		}
		
	}

}
